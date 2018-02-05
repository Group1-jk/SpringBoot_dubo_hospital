/** 
 * <pre>项目名称:Hospital_management 
 * 文件名称:uploadController.java 
 * 包名:com.jk.controller.tool 
 * 创建日期:2018年1月24日下午6:37:01 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.controller.tool;

import com.jk.util.UploadImg;
import com.mongodb.DB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/** 
 * <pre>项目名称：Hospital_management    
 * 类名称：uploadController  一句话描述这个方法的作用();  
 * 类描述：    
 * 创建人：王硕 ws_java@126.com    
 * 创建时间：2018年1月24日 下午6:37:01    
 * 修改人：王硕 ws_java@126.com  
 * 修改时间：2018年1月24日 下午6:37:01    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
@RequestMapping("upload")
public class uploadController {
	   @Autowired
	   private MongoTemplate mongoTemplate;
	   /**
	    * <pre>ImgUplod(上传视频)   
	    * 创建人：王硕 ws_java@126.com     
	    * 创建时间：2018年1月24日 下午6:41:15    
	    * 修改人：王硕 ws_java@126.com      
	    * 修改时间：2018年1月24日 下午6:41:15    
	    * 修改备注： 
	    * @param file
	    * @param request
	    * @param response
	    * @return</pre>
	    */
       @RequestMapping("ImgUplod")
		@ResponseBody
		public HashMap<String, Object> ImgUplod(@RequestParam(value = "hero_Img", required = false) MultipartFile file, 
				HttpServletRequest request,HttpServletResponse response ){
			
			DB db = mongoTemplate.getDb();
			HashMap<String, Object> map= UploadImg.uploadFile(file, db);
			return map;
		}
		/*
		 *展示视频和图片的
		 *将id传递过来即可
		 */
		@RequestMapping("queryImg")
		public  void  queryImg(String imgid,HttpServletResponse response) throws IOException{
			
			DB db = mongoTemplate.getDb();
			
			UploadImg.loadShowImg(response, imgid, db);
			   
		}

}

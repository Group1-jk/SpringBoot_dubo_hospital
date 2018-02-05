/** 
 * <pre>项目名称:ssm-bootstrap 
 * 文件名称:UploadImg.java 
 * 包名:com.jk.util 
 * 创建日期:2017年12月1日下午1:52:07 
 * Copyright (c) 2017, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.util;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

/** 
 * <pre>项目名称：ssm-bootstrap    
 * 类名称：UploadImg  一句话描述这个方法的作用();  
 * 类描述：    
 * 创建人：王硕 ws_java@126.com    
 * 创建时间：2017年12月1日 下午1:52:07    
 * 修改人：王硕 ws_java@126.com  
 * 修改时间：2017年12月1日 下午1:52:07    
 * 修改备注：       
 * @version </pre>    
 */
public class UploadImg {
	/**
	 *  此bootstrap上传文件使用规则：
	 *  在调用方法的实体类中创建一个获取MongoDB数据库的实例对象，以供此工具下的所有方法使用
	 *  
	 *  //获取MongoDB数据库  若获取数据库名字：mongoTemplate.getDb().getName();
	 *	DB db = mongoTemplate.getDb();
	 */
    
	//================================================查询图片 并展示==========================================
	
		public static void loadShowImg(HttpServletResponse response, String fileId, DB db){
			
			//创建本地MongoDB实例对象  并通过——id赋值对象  条件值
			BasicDBObject basicDBObject = new BasicDBObject("_id",fileId);
			
			//创建对象 通过mongoTemplate获取数据库并赋值给GirdFS
			GridFS girdFS = new GridFS(db);
			
			//通过获取的id条件值 和 本地数据库  查询id的唯一对象值
			GridFSDBFile gridFSDBFile = girdFS.findOne(basicDBObject);
			
			//定义全局的输出流为null
			ServletOutputStream outputStream = null;
			if (gridFSDBFile!=null) {
				try {
					//获取输出流对象
					outputStream = response.getOutputStream();
					//转发输出流类型
					response.setContentType("application/octet-stream");
					//把文件写入到流中  并转发到页面
					gridFSDBFile.writeTo(outputStream);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						outputStream.flush();//清空输出流
						outputStream.close();//关闭输出流
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
//=====================================  图片的上传到mongoDB 数据库	
		// controller 层的代码
		/*
		 * 
		 * @RequestMapping("ImgUplod")
		@ResponseBody
		public HashMap<String, Object> ImgUplod(@RequestParam(value = "hero_Img", required = false) MultipartFile file, 
				HttpServletRequest request,HttpServletResponse response ){
			
			DB db = mongoTemplate.getDb();
			HashMap<String, Object> map= UploadImg.uploadFile(file, db);
			return map;
	}
		 * */
		
		public static  HashMap<String, Object> uploadFile(MultipartFile file, DB db){
			
			//创建map 实例对象
			HashMap<String, Object> map = new HashMap<>();
			
			//获取上传文件的原始文件名
			String originalFilename = file.getOriginalFilename();
			
			//创建对象 通过mongoTemplate获取数据库并赋值给GirdFS
			GridFS gridFS = new GridFS(db);
			
			try {
				//通过文件的输入流，创建文件流
				GridFSInputFile createFile = gridFS.createFile(file.getInputStream());
				createFile.setId("img"+new Date().getTime());
				createFile.setFilename(originalFilename);
				createFile.put("downloadName", originalFilename);
				createFile.save();
				map.put("imgId", createFile.getId().toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return map;
		} 

//========================
		
		//======================================删除文件 / 更新文件=========================================  
		
		//更新文件之前先删除文件 再重新上传
		
		//删除文件    删除时要先获取文件的文件ID :  String fileId
		public static void deleteFile(DB db, String fileId){
			
			//先判断文件ID是否为空
			if (fileId!=null && fileId!="") {
				
				//创建本地MongoDB实例对象  并通过——id赋值对象  条件值
				BasicDBObject basicDBObject = new BasicDBObject("_id",fileId);
				
				//根据个人需要打印查看数据库中通过_id要删除的 fileId值
				System.out.println(basicDBObject);
				
				//创建对象 通过mongoTemplate获取数据库并赋值给GirdFS
				GridFS girdFS = new GridFS(db);
				
				//根据个人需要打印查看数据库的名字
				System.out.println(girdFS.getDB().getName());
				
				//通过获取的id条件值 和 本地数据库  查询id的唯一对象值
				girdFS.remove(basicDBObject);
			}
		}
		
	/*
	 *
	 
	 * 上传的方法
	@RequestMapping("ImgUplod")
	@ResponseBody
	public HashMap<String, Object> ImgUplod(@RequestParam(value = "hero_Img", required = false) MultipartFile file, 
			HttpServletRequest request,HttpServletResponse response ){
		
		DB db = mongoTemplate.getDb();
		HashMap<String, Object> map= UploadImg.uploadFile(file, db);
		return map;
	}
	 下载的方法
	@RequestMapping("queryImg")
	public  void  queryImg(String imgid,HttpServletResponse response) throws IOException{
		
		DB db = mongoTemplate.getDb();
		
		UploadImg.loadShowImg(response, imgid, db);
		   
	}*/
}

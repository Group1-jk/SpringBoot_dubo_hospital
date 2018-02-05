/** 
 * <pre>项目名称:Hospital 
 * 文件名称:VideoInfoService.java 
 * 包名:com.jk.service.ShowVideoInfo 
 * 创建日期:2018年1月29日下午3:28:51 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service.ShowVideoInfo;

import com.jk.model.ShowVideoInfo.VideoInfo;
import com.mongodb.gridfs.GridFSDBFile;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>项目名称：Hospital    
 * 类名称：VideoInfoService  一句话描述这个方法的作用();  
 * 类描述：    
 * 创建人：王硕 ws_java@126.com    
 * 创建时间：2018年1月29日 下午3:28:51    
 * 修改人：王硕 ws_java@126.com  
 * 修改时间：2018年1月29日 下午3:28:51    
 * 修改备注：       
 * @version </pre>    
 */
public interface VideoInfoService {


    Map findVideoList(VideoInfo video);

    /*上传是皮尼信息的方法*/
    HashMap<String,Object> advertImgUplod(MultipartFile file);

    GridFSDBFile queryAdvertImage(String advertImage);
   // 每100次数修改一次点击量
    void updateVideoClick(Integer imgid, Long i);

    VideoInfo findVideoInfoById(Integer imgid);
}

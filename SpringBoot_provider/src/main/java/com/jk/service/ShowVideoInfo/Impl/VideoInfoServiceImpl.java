/** 
 * <pre>项目名称:Hospital 
 * 文件名称:VideoInfoServiceImpl.java 
 * 包名:com.jk.service.ShowVideoInfo.Impl 
 * 创建日期:2018年1月29日下午3:29:09 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service.ShowVideoInfo.Impl;

import com.jk.dao.ShowVideoInfo.VideoInfoMapper;
import com.jk.model.ShowVideoInfo.VideoInfo;
import com.jk.service.ShowVideoInfo.VideoInfoService;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;

/** 
 * <pre>项目名称：Hospital    
 * 类名称：VideoInfoServiceImpl  一句话描述这个方法的作用();  
 * 类描述：    
 * 创建人：王硕 ws_java@126.com    
 * 创建时间：2018年1月29日 下午3:29:09    
 * 修改人：王硕 ws_java@126.com  
 * 修改时间：2018年1月29日 下午3:29:09    
 * 修改备注：       
 * @version </pre>    
 */
@Service
public class VideoInfoServiceImpl implements VideoInfoService {

	@Autowired
	private VideoInfoMapper videoInfoMapper;

	/* 注入mongoDB对象实例*/
	@Autowired
	private MongoTemplate mongoTemplate;
	@Override
	public Map findVideoList(VideoInfo video) {
		long count=videoInfoMapper.findVideoCount(video);//查询总条数

		List<LinkedHashMap> list= videoInfoMapper.findVideoList(video);//查询

		Map json=new LinkedHashMap();
		json.put("total", count);
		json.put("rows", list);
		return json;
	}

	@Override
	public HashMap<String, Object> advertImgUplod(MultipartFile file) {
		String fileName = file.getOriginalFilename();
		HashMap<String, Object> map=new HashMap<String, Object>();

		GridFS gr=new GridFS(mongoTemplate.getDb());

		try {
			GridFSInputFile fsFile = gr.createFile(file.getInputStream());

			fsFile.setId(UUID.randomUUID().toString());
			fsFile.setFilename(fileName);
			fsFile.put("downloadName", fileName);
			fsFile.save();
			map.put("imgId", fsFile.getId().toString());
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		return map;
	}

	/**
	 *  展示图片信息的方法
	 * @param advertImage
	 * @return
	 */
	@Override
	public GridFSDBFile queryAdvertImage(String advertImage) {
		DBObject query  = new BasicDBObject("_id", advertImage);
		GridFS gridFS = new GridFS(mongoTemplate.getDb());
		GridFSDBFile gridFSDBFile = gridFS.findOne(query);
		return gridFSDBFile;
	}

	@Override
	public void updateVideoClick(Integer imgid, Long i) {
		videoInfoMapper.updateVideoClick(imgid,i);
	}

	@Override
	public VideoInfo findVideoInfoById(Integer imgid) {
		return videoInfoMapper.selectByPrimaryKey(imgid);
	}
}

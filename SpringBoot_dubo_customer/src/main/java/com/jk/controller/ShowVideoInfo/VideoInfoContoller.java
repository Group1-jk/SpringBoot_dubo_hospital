/** 
 * <pre>项目名称:Hospital 
 * 文件名称:VideoInfoContoller.java 
 * 包名:com.jk.controller.ShowVideoInfo 
 * 创建日期:2018年1月29日下午3:27:22 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.controller.ShowVideoInfo;

import com.jk.model.ShowVideoInfo.VideoInfo;
import com.jk.service.ShowVideoInfo.VideoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/** 
 * <pre>项目名称：Hospital    
 * 类名称：VideoInfoContoller  一句话描述这个方法的作用();  
 * 类描述：    
 * 创建人：王硕 ws_java@126.com    
 * 创建时间：2018年1月29日 下午3:27:22    
 * 修改人：王硕 ws_java@126.com  
 * 修改时间：2018年1月29日 下午3:27:22    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
@RequestMapping("/VideoInfoContoller")
public class VideoInfoContoller {
	  
	@Autowired
	private VideoInfoService videoInfo;

	@Autowired
	private ShardedJedisPool shardedJedisPool;

	/**
	 * 去视频展示页面
	 * @return
	 */
	   @RequestMapping("/toVideoPage")
		String toVideoPage(){
		return "/VideoInfo/videoCore";
	   }

	/**
	 *  展示视频列表
	 *
	 */
    @RequestMapping("/VideoList")
	@ResponseBody
	public List<LinkedHashMap> VideoList(VideoInfo video){

       // 展示视频图片的信息  和视频的详细信息

		// 展示视频详细信
    	return videoInfo.VideoList(video);
	}

	/**
	 *  去视频分类展示页面
	 *   分类展示视频信息
	 * @return
	 */
	@RequestMapping("/toAdverTisePage")
	String AdverTise(){
		return "/VideoInfo/AdverTise";
	}

	/**
	 *  查询条数的集合
	 * @param video
	 * @return
	 */
	@RequestMapping("/findVideoList")
	@ResponseBody
	public Map findVideoList(VideoInfo video){

		return videoInfo.findVideoList(video);
	}
	/**
	 *  视频的详情页面
	 */

	 @RequestMapping("/queryVideoDetailInfo")
	 @ResponseBody
	  public ModelAndView queryVideoDetailInfo(Integer imgid){
		 /**
		  *  每点击超过100次 就新增到数据库中
		  */

		 ShardedJedis redis = shardedJedisPool.getResource();

		 Long i=redis.incr("Hospital"+imgid);
		 if(i%100==0){
			 videoInfo.updateVideoClick(imgid,i);
		 }

		 ModelAndView md=new ModelAndView();
		 // 查询视频的信息
		 VideoInfo video=videoInfo.findVideoInfoById(imgid);

		 md.addObject("video", video);
		 md.setViewName("/VideoInfo/PlayVideo");
		 return md;
	  }


}

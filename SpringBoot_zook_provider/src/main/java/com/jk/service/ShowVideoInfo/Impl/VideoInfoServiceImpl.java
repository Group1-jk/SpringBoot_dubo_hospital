/** 
 * <pre>项目名称:Hospital 
 * 文件名称:VideoInfoServiceImpl.java 
 * 包名:com.jk.service.ShowVideoInfo.Impl 
 * 创建日期:2018年1月29日下午3:29:09 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service.ShowVideoInfo.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.dao.ShowVideoInfo.VideoInfoMapper;
import com.jk.service.ShowVideoInfo.VideoInfoService;

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
@Service("videoInfo")
public class VideoInfoServiceImpl implements VideoInfoService {

	@Autowired
	private VideoInfoMapper videoInfoMapper;
}

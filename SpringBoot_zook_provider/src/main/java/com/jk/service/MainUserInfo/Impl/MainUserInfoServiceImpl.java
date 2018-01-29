/** 
 * <pre>项目名称:Hospital 
 * 文件名称:MainUserInfoServiceImpl.java 
 * 包名:com.jk.service.MainUserInfo.Impl 
 * 创建日期:2018年1月29日下午3:24:20 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service.MainUserInfo.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.dao.MainUserInfo.DoctorInfoMapper;
import com.jk.dao.MainUserInfo.MainUserInfoMapper;
import com.jk.dao.MainUserInfo.NormalUserMapper;
import com.jk.service.MainUserInfo.MainUserInfoService;

/** 
 * <pre>项目名称：Hospital    
 * 类名称：MainUserInfoServiceImpl  一句话描述这个方法的作用();  
 * 类描述：    
 * 创建人：王硕 ws_java@126.com    
 * 创建时间：2018年1月29日 下午3:24:20    
 * 修改人：王硕 ws_java@126.com  
 * 修改时间：2018年1月29日 下午3:24:20    
 * 修改备注：       
 * @version </pre>    
 */
@Service("userInfoService")
public class MainUserInfoServiceImpl implements MainUserInfoService {
	
	/**
	 *     对应医生增删改查的接口
	 */
	@Autowired
	private DoctorInfoMapper doctorInfoMapper;
	
	/**
	 *    对应用户信息主表的增删改查的结果
	 */
	@Autowired
	private MainUserInfoMapper mainUserInfoMapper;
	
	/**
	 *  对应普通用户
	 */
	@Autowired
	private NormalUserMapper normalUserMapper;

}

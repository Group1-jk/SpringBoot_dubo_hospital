/** 
 * <pre>项目名称:Hospital 
 * 文件名称:MainUserInfoController.java 
 * 包名:com.jk.controller.MainUserInfo 
 * 创建日期:2018年1月29日下午3:22:29 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.controller.MainUserInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jk.service.MainUserInfo.MainUserInfoService;

/** 
 * <pre>项目名称：Hospital    
 * 类名称：MainUserInfoController  一句话描述这个方法的作用();  
 * 类描述：    
 * 创建人：王硕 ws_java@126.com    
 * 创建时间：2018年1月29日 下午3:22:29    
 * 修改人：王硕 ws_java@126.com  
 * 修改时间：2018年1月29日 下午3:22:29    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
@RequestMapping("/UserInfoController")
public class MainUserInfoController {
	
	@Autowired
	private MainUserInfoService userInfoService;
	
	

}

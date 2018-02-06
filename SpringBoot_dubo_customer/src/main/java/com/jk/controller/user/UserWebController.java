package com.jk.controller.user;

import com.jk.model.user.UserWeb;
import com.jk.service.user.UserWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("userweb")
public class UserWebController {

	@Autowired
	UserWebService userWebService;
	
	/**
	 * <pre>tologin(跳转登录)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月25日 下午3:52:38    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月25日 下午3:52:38    
	 * 修改备注： 
	 * @return</pre>
	 */
	@RequestMapping("tologin")
	String tologin(){
		
		return "../login";
	}
	
	
	@RequestMapping("userWebLogin")
	int userWebLogin(UserWeb userweb){
		
		int flag = userWebService.userWebLogin(userweb);
		
		return flag;
	}
	
	
	
}

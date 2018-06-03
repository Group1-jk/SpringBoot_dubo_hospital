package com.jk.controller.login;

import com.jk.model.login.LoginUser;
import com.jk.service.login.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
/**
 * 
 * <pre>项目名称：Group4-web    
 * 类名称：LoginUserController    
 * 类描述：    
 * 创建人：段浩 1261131109@qq.com   
 * 创建时间：2018年1月29日 下午8:16:48    
 * 修改人：段浩 1261131109@qq.com      
 * 修改时间：2018年1月29日 下午8:16:48    
 * 修改备注：       
 * @version </pre>
 */
@Controller
@RequestMapping("loginuser")
public class LoginUserController {

	@Autowired
	LoginUserService loginUserService;
	
	/**
	 * <pre>loginUser(登录认证)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月29日 下午8:16:29    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月29日 下午8:16:29    
	 * 修改备注： 
	 * @param login
	 * @return</pre>
	 */
	@RequestMapping("loginUser")
	@ResponseBody
	int loginUser(LoginUser login, HttpServletRequest request){
		int flag = loginUserService.loginUser(login,request);
		
		return flag;
	}
	//asdjfkadsjfhjksah wangshuo
	// wangwushuo
	/**
	 * <pre>loginAccount(昵称展示)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月31日 下午3:13:12    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月31日 下午3:13:12    
	 * 修改备注： 
	 * @param request
	 * @return</pre>
	 */
	@RequestMapping("loginAccount")
	@ResponseBody
	LoginUser loginAccount(HttpServletRequest request){
		LoginUser login = (LoginUser) request.getSession().getAttribute("login");
		return login;
	}
	
	/**
	 * <pre>tologout(注销)   
	 * 创建人：段浩 1261131109@qq.com     
	 * 创建时间：2018年1月31日 下午3:15:07    
	 * 修改人：段浩 1261131109@qq.com   
	 * 修改时间：2018年1月31日 下午3:15:07    
	 * 修改备注： 
	 * @param request</pre>
	 */
	@RequestMapping("tologout")
	@ResponseBody
	void tologout(HttpServletRequest request){
		
		request.getSession().removeAttribute("login");
		System.out.println(request.getSession().getAttribute("login"));
	}
	
	
	
}

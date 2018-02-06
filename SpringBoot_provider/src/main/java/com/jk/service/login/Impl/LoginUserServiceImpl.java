package com.jk.service.login.Impl;

import com.jk.dao.login.LoginUserMapper;
import com.jk.model.login.LoginUser;
import com.jk.service.login.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
@Service
public class LoginUserServiceImpl implements LoginUserService {

	@Autowired
	LoginUserMapper loginUserMapper;

	@Override
	public int loginUser(LoginUser login, HttpServletRequest request) {
		String userPass = login.getUserPass();
		String sub = userPass.substring(1);
		LoginUser login1 = loginUserMapper.loginUserAccount(login.getUserAccount());
		if(login1!=null){
			LoginUser login2 = loginUserMapper.loginUserPass(login.getUserAccount(),sub);
			if(login2!=null){
				request.getSession().setAttribute("login", login2);
				return 2;
			}
			return 1;
		}
		
		return 0;
	}

	
	
	
	
	
}

package com.jk.service.login;

import com.jk.model.login.LoginUser;

import javax.servlet.http.HttpServletRequest;


public interface LoginUserService {

	int loginUser(LoginUser login, HttpServletRequest request);

}

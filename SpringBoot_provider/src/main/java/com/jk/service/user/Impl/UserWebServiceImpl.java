package com.jk.service.user.Impl;

import com.jk.dao.user.UserWebMapper;
import com.jk.model.user.UserWeb;
import com.jk.service.user.UserWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserWebServiceImpl implements UserWebService {

	@Autowired
	UserWebMapper userWebMapper;

	@Override
	public int userWebLogin(UserWeb userweb) {
		
		return 0;
	}
	
	
	
	
}

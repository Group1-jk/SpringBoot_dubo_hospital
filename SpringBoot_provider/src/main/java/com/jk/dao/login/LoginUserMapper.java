package com.jk.dao.login;

import com.jk.model.login.LoginUser;
import org.apache.ibatis.annotations.Param;


public interface LoginUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(LoginUser record);

    int insertSelective(LoginUser record);

    LoginUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(LoginUser record);

    int updateByPrimaryKey(LoginUser record);
    //验证账号
	LoginUser loginUserAccount(String userAccount);
	//验证密码
	LoginUser loginUserPass(@Param("userAccount") String userAccount, @Param("userPass") String userPass);
}
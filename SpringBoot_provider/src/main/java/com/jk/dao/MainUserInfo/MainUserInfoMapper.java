package com.jk.dao.MainUserInfo;

import com.jk.model.MainUserInfo.MainUserInfo;

public interface MainUserInfoMapper {
	
    int deleteByPrimaryKey(Integer userId);

    int insert(MainUserInfo record);

    int insertSelective(MainUserInfo record);

    MainUserInfo selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(MainUserInfo record);

    int updateByPrimaryKey(MainUserInfo record);
    
}
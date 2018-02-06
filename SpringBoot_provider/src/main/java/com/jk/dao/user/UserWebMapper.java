package com.jk.dao.user;


import com.jk.model.user.UserWeb;

public interface UserWebMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserWeb record);

    int insertSelective(UserWeb record);

    UserWeb selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserWeb record);

    int updateByPrimaryKey(UserWeb record);
}
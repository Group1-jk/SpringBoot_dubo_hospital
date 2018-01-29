package com.jk.dao.MainUserInfo;

import com.jk.model.MainUserInfo.OrganizationInfo;

public interface OrganizationInfoMapper {
    int deleteByPrimaryKey(Integer infoId);

    int insert(OrganizationInfo record);

    int insertSelective(OrganizationInfo record);

    OrganizationInfo selectByPrimaryKey(Integer infoId);

    int updateByPrimaryKeySelective(OrganizationInfo record);

    int updateByPrimaryKey(OrganizationInfo record);
}
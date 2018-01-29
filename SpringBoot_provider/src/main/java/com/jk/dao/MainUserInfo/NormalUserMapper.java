package com.jk.dao.MainUserInfo;

import com.jk.model.MainUserInfo.NormalUser;

public interface NormalUserMapper {
    int deleteByPrimaryKey(Integer infoId);

    int insert(NormalUser record);

    int insertSelective(NormalUser record);

    NormalUser selectByPrimaryKey(Integer infoId);

    int updateByPrimaryKeySelective(NormalUser record);

    int updateByPrimaryKeyWithBLOBs(NormalUser record);

    int updateByPrimaryKey(NormalUser record);
}
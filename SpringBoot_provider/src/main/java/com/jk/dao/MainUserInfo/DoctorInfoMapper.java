package com.jk.dao.MainUserInfo;

import com.jk.model.MainUserInfo.DoctorInfo;

public interface DoctorInfoMapper {
    int deleteByPrimaryKey(Integer infoId);

    int insert(DoctorInfo record);

    int insertSelective(DoctorInfo record);

    DoctorInfo selectByPrimaryKey(Integer infoId);

    int updateByPrimaryKeySelective(DoctorInfo record);

    int updateByPrimaryKeyWithBLOBs(DoctorInfo record);

    int updateByPrimaryKey(DoctorInfo record);
}
package com.jk.dao.ShowVideoInfo;

import com.jk.model.ShowVideoInfo.VideoInfo;

public interface VideoInfoMapper {
    int deleteByPrimaryKey(Integer videoId);

    int insert(VideoInfo record);

    int insertSelective(VideoInfo record);

    VideoInfo selectByPrimaryKey(Integer videoId);

    int updateByPrimaryKeySelective(VideoInfo record);

    int updateByPrimaryKey(VideoInfo record);
}
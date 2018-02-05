package com.jk.dao.ShowVideoInfo;

import com.jk.model.ShowVideoInfo.VideoInfo;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;

public interface VideoInfoMapper {
    int deleteByPrimaryKey(Integer videoId);

    int insert(VideoInfo record);

    int insertSelective(VideoInfo record);

    VideoInfo selectByPrimaryKey(Integer videoId);

    int updateByPrimaryKeySelective(VideoInfo record);

    int updateByPrimaryKey(VideoInfo record);

    /**
     *  查询视频的总共条数
     * @param video
     * @return
     */
    long findVideoCount(VideoInfo video);

    /**
     *  查询视频列表信息
     * @param video
     * @return
     */
    List<LinkedHashMap> findVideoList(VideoInfo video);

    void updateVideoClick(@Param("imgid")Integer imgid, @Param("i")Long i);
}
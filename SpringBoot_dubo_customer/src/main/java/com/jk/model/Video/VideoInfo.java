package com.jk.model.Video;

import java.io.Serializable;
import java.util.Date;

/**
 *  查询后台用户上传的视频的展示信息
 */
public class VideoInfo implements Serializable {

    private Integer videoId;

    private String videoSaveid;

    private Integer videoType;

    private String videoName;

    private String videoImgid;

    private Double videoCost;

    private String videoInfo;

    private Integer videoClick;

    private Integer videoUserid;

    private Integer videoStatus;

    private Integer videoScore;

    private Short checkStatus;

    private Date videoAddtime;

    private Integer videoinnertypeid;

    private String videostrtypeid;

    private Integer videoTime;

    private Integer videoOrderflag;

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoSaveid() {
        return videoSaveid;
    }

    public void setVideoSaveid(String videoSaveid) {
        this.videoSaveid = videoSaveid == null ? null : videoSaveid.trim();
    }

    public Integer getVideoType() {
        return videoType;
    }

    public void setVideoType(Integer videoType) {
        this.videoType = videoType;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getVideoImgid() {
        return videoImgid;
    }

    public void setVideoImgid(String videoImgid) {
        this.videoImgid = videoImgid == null ? null : videoImgid.trim();
    }

    public Double getVideoCost() {
        return videoCost;
    }

    public void setVideoCost(Double videoCost) {
        this.videoCost = videoCost;
    }

    public String getVideoInfo() {
        return videoInfo;
    }

    public void setVideoInfo(String videoInfo) {
        this.videoInfo = videoInfo == null ? null : videoInfo.trim();
    }

    public Integer getVideoClick() {
        return videoClick;
    }

    public void setVideoClick(Integer videoClick) {
        this.videoClick = videoClick;
    }

    public Integer getVideoUserid() {
        return videoUserid;
    }

    public void setVideoUserid(Integer videoUserid) {
        this.videoUserid = videoUserid;
    }

    public Integer getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(Integer videoStatus) {
        this.videoStatus = videoStatus;
    }

    public Integer getVideoScore() {
        return videoScore;
    }

    public void setVideoScore(Integer videoScore) {
        this.videoScore = videoScore;
    }

    public Short getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Short checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Date getVideoAddtime() {
        return videoAddtime;
    }

    public void setVideoAddtime(Date videoAddtime) {
        this.videoAddtime = videoAddtime;
    }

    public Integer getVideoinnertypeid() {
        return videoinnertypeid;
    }

    public void setVideoinnertypeid(Integer videoinnertypeid) {
        this.videoinnertypeid = videoinnertypeid;
    }

    public String getVideostrtypeid() {
        return videostrtypeid;
    }

    public void setVideostrtypeid(String videostrtypeid) {
        this.videostrtypeid = videostrtypeid == null ? null : videostrtypeid.trim();
    }

    public Integer getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(Integer videoTime) {
        this.videoTime = videoTime;
    }

    public Integer getVideoOrderflag() {
        return videoOrderflag;
    }

    public void setVideoOrderflag(Integer videoOrderflag) {
        this.videoOrderflag = videoOrderflag;
    }
}
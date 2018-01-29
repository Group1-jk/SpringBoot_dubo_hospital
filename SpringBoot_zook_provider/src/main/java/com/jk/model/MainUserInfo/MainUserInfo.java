package com.jk.model.MainUserInfo;


import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class MainUserInfo implements Serializable{
	
   private static final long serialVersionUID = 3733194986346280744L;

/*	
	CREATE TABLE `t_user_l` (
			  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
			  `user_account` varchar(20) DEFAULT NULL COMMENT '账号',
			  `user_phone` varchar(15) DEFAULT NULL COMMENT '电话',
			  `user_niki` varchar(20) DEFAULT NULL COMMENT '昵称',
			  `user_pass` varchar(20) DEFAULT NULL COMMENT '密码',
			  `user_head_id` varchar(30) DEFAULT NULL COMMENT '头像id',
			  `login_time` datetime DEFAULT NULL COMMENT '登录时间',
			  `register_time` datetime DEFAULT NULL COMMENT '注册时间',
			  `user_state` smallint(6) DEFAULT NULL COMMENT '用户状态',
			 
			  `user_level` smallint(6) DEFAULT NULL COMMENT '等级',
			  `user_score` int(11) DEFAULT NULL COMMENT '积分',
			  `info_id` int(11) DEFAULT '0' COMMENT '详情id',
			  PRIMARY KEY (`user_id`)
			) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;
	*/
	/**
	 * 
	 */
    private Integer userId;

    /**
	 * 
	 */
    private String userAccount;

    /**
	 * 
	 */
    private String userPhone;

    /**
	 * 
	 */
    private String userNiki;

    /**
	 * 
	 */
    private String userPass;

    /**
	 * 头像id
	 */
    private String userHeadId;

    /**
	 * 
	 */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date loginTime;

    /**
	 * 
	 */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date registerTime;

    /**
	 * 
	 */
    private Short userState;

    /**
	 *  `user_type` smallint(6) DEFAULT NULL COMMENT '用户类型 1 医生 2 医院 3 普通',
	 *  
	 *  1-医生
	 *  2 -供应商和以及医院
	 *  3-普通用户
	 */
    private Short userType;

    /**
	 *  用户等级 
	 *  1 普通
	 *  2高级
	 *  3vip
	 *  1- 评论视频
	 *  2- 上传视频
	 *  3- 观看视频无扣费
	 *  
	 */
    private Short userLevel;

    /**
     * 
	 * 
	 */
    private Integer userScore;

    /**详情id 和类型连用查询对应的表的集合
	 *  用户等级 
	 *  1 普通
	 *  2高级
	 *  3vip
	 *  1- 评论视频
	 *  2- 上传视频
	 *  3- 观看视频无扣费
	 *  
	 */
    private Integer infoId;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserNiki() {
        return userNiki;
    }

    public void setUserNiki(String userNiki) {
        this.userNiki = userNiki == null ? null : userNiki.trim();
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public String getUserHeadId() {
        return userHeadId;
    }

    public void setUserHeadId(String userHeadId) {
        this.userHeadId = userHeadId == null ? null : userHeadId.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Short getUserState() {
        return userState;
    }

    public void setUserState(Short userState) {
        this.userState = userState;
    }

    public Short getUserType() {
        return userType;
    }

    public void setUserType(Short userType) {
        this.userType = userType;
    }

    public Short getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Short userLevel) {
        this.userLevel = userLevel;
    }

    public Integer getUserScore() {
        return userScore;
    }

    public void setUserScore(Integer userScore) {
        this.userScore = userScore;
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }
}
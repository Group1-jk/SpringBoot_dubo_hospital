package com.jk.model.MainUserInfo;

import java.io.Serializable;

public class OrganizationInfo implements Serializable{
    private static final long serialVersionUID = 2445568732533485266L;
    
    
    /**
     * CREATE TABLE `t_info_2` (
    		  `info_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    		  `user_name` varchar(20) DEFAULT NULL COMMENT '姓名',
    		  `user_intro` varchar(500) DEFAULT NULL COMMENT '简介',
    		  `net_url` varchar(20) DEFAULT NULL COMMENT '网站地址',
    		  `user_level` smallint(2) DEFAULT NULL COMMENT '等级',
    		  `business_card` varchar(20) DEFAULT NULL COMMENT '营业执照',
    		  `status_card` varchar(20) DEFAULT NULL COMMENT '医院资质证书',
    		  `promise_book` varchar(20) DEFAULT NULL COMMENT '承诺书',
    		  `check_status` smallint(2) DEFAULT NULL COMMENT '审核状态',
    		  PRIMARY KEY (`info_id`)
     */

	private Integer infoId;

    private String userName;

    // `user_address` varchar(10) DEFAULT NULL COMMENT '地址',
    private String userAddress;

    //`user_logo` varchar(20) DEFAULT NULL COMMENT 'logo图像',
    private String userLogo;

    //`user_email` varchar(20) DEFAULT NULL COMMENT '邮箱',
    private String userEmail;

    private String userIntro;

    //`study_direction` varchar(100) DEFAULT NULL COMMENT '主攻方向',
    private String studyDirection;

    // 医院的官网地址
    private String netUrl;

    ////`user_struture` varchar(5) DEFAULT NULL COMMENT '医院等级 国有 私人',
    private String userStruture;

    //`user_type` smallint(1) DEFAULT NULL COMMENT '类型  科室分',
    private Short userType;

    private Short userLevel;

    private String businessCard;

    private String statusCard;

    private String promiseBook;

    private Short checkStatus;

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserLogo() {
        return userLogo;
    }

    public void setUserLogo(String userLogo) {
        this.userLogo = userLogo == null ? null : userLogo.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserIntro() {
        return userIntro;
    }

    public void setUserIntro(String userIntro) {
        this.userIntro = userIntro == null ? null : userIntro.trim();
    }

    public String getStudyDirection() {
        return studyDirection;
    }

    public void setStudyDirection(String studyDirection) {
        this.studyDirection = studyDirection == null ? null : studyDirection.trim();
    }

    public String getNetUrl() {
        return netUrl;
    }

    public void setNetUrl(String netUrl) {
        this.netUrl = netUrl == null ? null : netUrl.trim();
    }

    public String getUserStruture() {
        return userStruture;
    }

    public void setUserStruture(String userStruture) {
        this.userStruture = userStruture == null ? null : userStruture.trim();
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

    public String getBusinessCard() {
        return businessCard;
    }

    public void setBusinessCard(String businessCard) {
        this.businessCard = businessCard == null ? null : businessCard.trim();
    }

    public String getStatusCard() {
        return statusCard;
    }

    public void setStatusCard(String statusCard) {
        this.statusCard = statusCard == null ? null : statusCard.trim();
    }

    public String getPromiseBook() {
        return promiseBook;
    }

    public void setPromiseBook(String promiseBook) {
        this.promiseBook = promiseBook == null ? null : promiseBook.trim();
    }

    public Short getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Short checkStatus) {
        this.checkStatus = checkStatus;
    }
}
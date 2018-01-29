package com.jk.model.MainUserInfo;


import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class NormalUser implements Serializable{
	
	private static final long serialVersionUID = 7628298019627912814L;

	/**
	 * CREATE TABLE `t_info_3` (
    		  `info_id` int(11) NOT NULL DEFAULT '0' COMMENT '主键id',
    		  `user_name` varchar(10) DEFAULT NULL COMMENT '姓名',
    		  `user_sex` smallint(1) DEFAULT NULL COMMENT '性别',
    		  `user_age` smallint(3) DEFAULT NULL COMMENT '年龄',
    		  `user_birth` date DEFAULT NULL COMMENT '生日',
    		  `user_address` varchar(10) DEFAULT NULL COMMENT '地址',
    		  `user_email` varchar(20) DEFAULT NULL COMMENT '邮箱',
    		  `user_intro` varchar(500) DEFAULT NULL COMMENT '简介',
    		  `body_card` varchar(20) DEFAULT NULL COMMENT '身份证件',
    		  `medical_go` varbinary(300) DEFAULT NULL COMMENT '从医经历',
    		  `promise_book` varchar(20) DEFAULT NULL COMMENT '承诺书',
    		  `check_state` smallint(2) DEFAULT NULL COMMENT '审核状态',
    		  `user_work` smallint(3) DEFAULT NULL,
    		  PRIMARY KEY (`info_id`)
    		) ENGINE=InnoDB DEFAULT CHARSET=utf8;
	 */
	// - 普通用户的id
    private Integer infoId;

    private String userName;

    // 1-男 2-女
    private Short userSex;

    private Short userAge;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date userBirth;

    private String userAddress;

    private String userEmail;

    private String userIntro;

    // 身份证件
    private String bodyCard;

    private String promiseBook;

    private Short checkState;

    // 工作类型 可以关联工作类型表以及用户的下拉表
    private Short userWork;

    // 医院资质
    private byte[] medicalGo;

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

    public Short getUserSex() {
        return userSex;
    }

    public void setUserSex(Short userSex) {
        this.userSex = userSex;
    }

    public Short getUserAge() {
        return userAge;
    }

    public void setUserAge(Short userAge) {
        this.userAge = userAge;
    }

    public Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
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

    public String getBodyCard() {
        return bodyCard;
    }

    public void setBodyCard(String bodyCard) {
        this.bodyCard = bodyCard == null ? null : bodyCard.trim();
    }

    public String getPromiseBook() {
        return promiseBook;
    }

    public void setPromiseBook(String promiseBook) {
        this.promiseBook = promiseBook == null ? null : promiseBook.trim();
    }

    public Short getCheckState() {
        return checkState;
    }

    public void setCheckState(Short checkState) {
        this.checkState = checkState;
    }

    public Short getUserWork() {
        return userWork;
    }

    public void setUserWork(Short userWork) {
        this.userWork = userWork;
    }

    public byte[] getMedicalGo() {
        return medicalGo;
    }

    public void setMedicalGo(byte[] medicalGo) {
        this.medicalGo = medicalGo;
    }
}
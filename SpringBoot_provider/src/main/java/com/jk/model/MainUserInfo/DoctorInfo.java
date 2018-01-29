package com.jk.model.MainUserInfo;

import java.io.Serializable;
import java.util.Date;

public class DoctorInfo implements Serializable{
	
    private static final long serialVersionUID = -2808279228313998087L;

    /**
     * CREATE TABLE `t_info_1` (
    		  `info_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    		  `user_name` varchar(10) DEFAULT NULL COMMENT '姓名',
    		  `user_sex` smallint(1) DEFAULT NULL COMMENT '性别',
    		  `user_age` smallint(3) DEFAULT NULL COMMENT '年龄',
    		  `user_birth` date DEFAULT NULL COMMENT '生日',
    		  `user_address` varchar(10) DEFAULT NULL COMMENT '地址',
    		  `user_email` varchar(20) DEFAULT NULL COMMENT '邮箱',
    		  `user_intro` varchar(500) DEFAULT NULL COMMENT '简介',
    		  `medical_go` varbinary(300) DEFAULT NULL COMMENT '从医经历',
    		  `medical_result` varchar(100) DEFAULT NULL COMMENT '医学成果',
    		  `promise_book` varchar(20) DEFAULT NULL COMMENT '承诺书',
    		  `check_state` smallint(2) DEFAULT NULL COMMENT '审核状态',
    		  PRIMARY KEY (`info_id`)
    		) ENGINE=InnoDB DEFAULT CHARSET=utf8;

     */
    // 医生的主键id
	private Integer infoId;

    private String userName;

    private Short userSex;

    private Short userAge;

    private Date userBirth;

    private String userAddress;

    private String userEmail;

    private String userIntro;

    // `eduction_card` varchar(20) DEFAULT NULL COMMENT '学历证书',
    private String eductionCard;

    // `body_card` varchar(20) DEFAULT NULL COMMENT '身份证件',
    private String bodyCard;

    //`status_card` varchar(20) DEFAULT NULL COMMENT '资格证书',
    private String statusCard;

    //`doctor_card` varchar(20) DEFAULT NULL COMMENT '从医证',
    private String doctorCard;

    // `medical_result` varchar(100) DEFAULT NULL COMMENT '医学成果',
    private String medicalResult;

    // `promise_book` varchar(20) DEFAULT NULL COMMENT '承诺书',
    private String promiseBook;

    // 审核状态 1- 审核通过
    private Short checkState;
 
    
   
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

    public String getEductionCard() {
        return eductionCard;
    }

    public void setEductionCard(String eductionCard) {
        this.eductionCard = eductionCard == null ? null : eductionCard.trim();
    }

    public String getBodyCard() {
        return bodyCard;
    }

    public void setBodyCard(String bodyCard) {
        this.bodyCard = bodyCard == null ? null : bodyCard.trim();
    }

    public String getStatusCard() {
        return statusCard;
    }

    public void setStatusCard(String statusCard) {
        this.statusCard = statusCard == null ? null : statusCard.trim();
    }

    public String getDoctorCard() {
        return doctorCard;
    }

    public void setDoctorCard(String doctorCard) {
        this.doctorCard = doctorCard == null ? null : doctorCard.trim();
    }

    public String getMedicalResult() {
        return medicalResult;
    }

    public void setMedicalResult(String medicalResult) {
        this.medicalResult = medicalResult == null ? null : medicalResult.trim();
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

    public byte[] getMedicalGo() {
        return medicalGo;
    }

    public void setMedicalGo(byte[] medicalGo) {
        this.medicalGo = medicalGo;
    }
}
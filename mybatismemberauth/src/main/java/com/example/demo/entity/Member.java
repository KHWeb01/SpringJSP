package com.example.demo.entity;

import java.time.LocalDateTime;

public class Member {
	
	private int userNo;
	private String userId;
	private String userPw;
	private String userName;
	private LocalDateTime regDate;
	
	// 필요에 따라 권한 설정
	
	
	// 매서드
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public LocalDateTime getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "Member [userNo=" + userNo + ", userId=" + userId + ", userPw=" + userPw + ", userName=" + userName
				+ ", regDate=" + regDate + "]";
	}
}

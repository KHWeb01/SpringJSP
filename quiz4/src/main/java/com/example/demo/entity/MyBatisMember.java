package com.example.demo.entity;

public class MyBatisMember {
	
	private String id;

	private String password;

	private String email;

	private String phoneNumber;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "MyBatisMember [id=" + id + ", password=" + password + ", email=" + email + ", phoneNumber="
				+ phoneNumber + "]";
	}
}

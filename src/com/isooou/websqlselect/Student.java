package com.isooou.websqlselect;

public class Student {

	private String username;
	private String userpassword;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public Student(String username, String userpassword) {
		super();
		this.username = username;
		this.userpassword = userpassword;
	}
	
	public Student(){
		
	}
	
}

package com.zad.models;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class User {
	private String userName;
	private CommonsMultipartFile image;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public CommonsMultipartFile getImage() {
		return image;
	}
	public void setImage(CommonsMultipartFile image) {
		this.image = image;
	}

}

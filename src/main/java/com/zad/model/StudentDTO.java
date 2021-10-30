package com.zad.model;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class StudentDTO {

	private int id;
	private String firstName;
	private String secondName;
	private String thirdName;
	private String familyName;
	private Date DOB; 
	private int level;
	private int mobile1;
	private int mobile2;
	private int phone;
	private String address;
	private MultipartFile image;
	private String schoolName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getThirdName() {
		return thirdName;
	}
	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMobile1() {
		return mobile1;
	}
	public void setMobile1(int mobile1) {
		this.mobile1 = mobile1;
	}
	public int getMobile2() {
		return mobile2;
	}
	public void setMobile2(int mobile2) {
		this.mobile2 = mobile2;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
}

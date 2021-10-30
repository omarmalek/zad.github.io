package com.zad.model;

import java.util.Date;

public class Employee {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_card() {
		return id_card;
	}
	public void setId_card(int id_card) {
		this.id_card = id_card;
	}
	public int getUnrwaRegCardNo() {
		return unrwaRegCardNo;
	}
	public void setUnrwaRegCardNo(int unrwaRegCardNo) {
		this.unrwaRegCardNo = unrwaRegCardNo;
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
	public byte[] getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(byte[] profileImage) {
		this.profileImage = profileImage;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public String getMoreInfo() {
		return moreInfo;
	}
	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}
	private int id ;
	private int id_card;
	private int unrwaRegCardNo ;
	private String firstName;
	private String secondName;
	private String thirdName;
	private String familyName;
	private int mobile1;
	private int mobile2;
	private int phone;
	private String address;
	private byte[] profileImage;
	private String specialization;
	private Date DOB;
	private String position;
	private String Grade;
	private String moreInfo;

}

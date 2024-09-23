package com.user.bean;
import java.io.*;
@SuppressWarnings("serial")
public class UserBean implements Serializable
{
	private String uName, pWord, fName, lName,address, mailId;
	private long phNo;
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getpWord() {
		return pWord;
	}
	public void setpWord(String pWord) {
		this.pWord = pWord;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}
	
	
}

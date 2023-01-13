package com.exam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tId;
	private String tName;
	private String tEmail;
	private String tPhone;
	private String address;
	
	public Teacher() {

	}

	public Long gettId() {
		return tId;
	}

	public void settId(Long tId) {
		this.tId = tId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettEmail() {
		return tEmail;
	}

	public void settEmail(String tEmail) {
		this.tEmail = tEmail;
	}

	public String gettPhone() {
		return tPhone;
	}

	public void settPhone(String tPhone) {
		this.tPhone = tPhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Teacher(Long tId, String tName, String tEmail, String tPhone, String address) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.tEmail = tEmail;
		this.tPhone = tPhone;
		this.address = address;
	}
	
	
	
	
}

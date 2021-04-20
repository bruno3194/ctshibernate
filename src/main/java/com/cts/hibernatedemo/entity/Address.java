package com.cts.hibernatedemo.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String hNo;
	private String city;
	private Integer pincode;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String hNo, String city, Integer pincode) {
		super();
		this.hNo = hNo;
		this.city = city;
		this.pincode = pincode;
	}

	public String gethNo() {
		return hNo;
	}

	public void sethNo(String hNo) {
		this.hNo = hNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", city=" + city + ", pincode=" + pincode + "]";
	}

}

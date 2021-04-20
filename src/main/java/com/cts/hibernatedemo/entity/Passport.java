package com.cts.hibernatedemo.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//Minimum 2 mappings are needed 1.@Entity 2.@Id
@Entity // Must
@Table(name = "Hib_Passport")
public class Passport {

	@Id // Must
	@Column(name = "pass_number")
	private Integer passportNumber;
	private Date issudeDate;
	private String issudePlace;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="person_id")
	private Person person;
	

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Passport() {
	}

	public Integer getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(Integer passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Date getIssudeDate() {
		return issudeDate;
	}

	public void setIssudeDate(Date issudeDate) {
		this.issudeDate = issudeDate;
	}

	public String getIssudePlace() {
		return issudePlace;
	}

	public void setIssudePlace(String issudePlace) {
		this.issudePlace = issudePlace;
	}

	public Passport(Integer passportNumber, Date issudeDate, String issudePlace) {
		super();
		this.passportNumber = passportNumber;
		this.issudeDate = issudeDate;
		this.issudePlace = issudePlace;
	}

}

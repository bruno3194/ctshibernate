package com.cts.hibernatedemo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//Minimum 2 mappings are needed 1.@Entity 2.@Id
@Entity // Must 
@Table(name="Hib_Person")
public class Person {
	
    @Id //Must 
    @Column(name="p_id")
	private Integer personId;
    @Column(name="p_name",length=30)
	private String personName;
	private Integer age;
    @Column(length=6)
	private String gender;

    @OneToOne(mappedBy="person",fetch=FetchType.LAZY,cascade= CascadeType.ALL)
    private Passport passport;
    
    
    
	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	// Must needed
	public Person() {
	}
	
	public Person(Integer personId, String personName, Integer age, String gender) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.age = age;
		this.gender = gender;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", age=" + age + ", gender="
				+ gender + "]";
	}

}

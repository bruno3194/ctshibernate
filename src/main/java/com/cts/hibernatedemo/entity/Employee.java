package com.cts.hibernatedemo.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Minimum 2 mappings are needed 1.@Entity 2.@Id
@Entity // Must
@Table(name = "Hib_Employee")
public class Employee {

	@Id // Must
	@Column(name = "e_id")
	private Integer employeeId;
	@Column(name = "e_name", length = 30)
	private String employeeName;
	private Integer age;
	@Column(length = 6)
	private String gender;

	@Embedded
	private Address address;

	// Must needed
	public Employee() {
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(Integer employeeId, String employeeName, Integer age, String gender) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
		this.gender = gender;
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
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", age=" + age + ", gender="
				+ gender + ", address=" + address + "]";
	}

}

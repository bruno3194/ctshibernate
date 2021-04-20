package com.cts.hibernatedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//Minimum 2 mappings are needed 1.@Entity 2.@Id
@Entity // Must 
@Table(name="Hib_Student")
public class Student {
	
    @Id //Must 
    @Column(name="s_id")
	private Integer studentId;
    @Column(name="S_name",length=30)
	private String studentName;
	private Integer age;
    @Column(length=6)
	private String gender;

	// Must needed
	public Student() {
	}
	
	public Student(Integer studentId, String studentName, Integer age, String gender) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.gender = gender;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
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
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + ", gender="
				+ gender + "]";
	}

}

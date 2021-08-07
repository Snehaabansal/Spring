package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentInformation")
public class Student {
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", gender=" + gender + ", city=" + city + "]";
	}
	@Id
	@Column(name="StudentID")
	private int studentid;
	@Column(name="StudentName")
	private String name;
	@Column(name="Gender")
	private String gender;
	@Column(name="city")
	private String city;
	
	public Student(int studentid, String name, String gender, String city) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.gender = gender;
		this.city = city;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}

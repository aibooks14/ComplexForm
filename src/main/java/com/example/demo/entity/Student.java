package com.example.demo.entity;

import java.util.Date;
import java.util.List;

public class Student {

	private String name;
	private Long id;
	private Date date;

	// Form select type data , we have to LIST or Array
	private List<String> courses;
	private String gender;
	private String type;

	
	
	private Address address ;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, Long id, Date date, List<String> courses, String gender, String type) {
		super();
		this.name = name;
		this.id = id;
		this.date = date;
		this.courses = courses;
		this.gender = gender;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", date=" + date + ", courses=" + courses + ", gender=" + gender
				+ ", type=" + type + ", address=" + address + "]";
	}
	
	

}

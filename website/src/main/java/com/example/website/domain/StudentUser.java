package com.example.website.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.website.repository.StudentUserDAO;

@Component
public class StudentUser implements User{
	
	@Autowired
	StudentUserDAO studentUserDAO;
	
	String name;
	String gender;
	String location;
	String college;
	int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	
	
	@Override
	public boolean createUser(String name, String gender, String location, String college) {
		this.name = name;
		this.college = college;
		this.gender = gender;
		this.location = location;
		return true;
	}

	@Override
	public Integer saveUser() {
		System.out.println(this.name);
		return studentUserDAO.save(this);
	}

}
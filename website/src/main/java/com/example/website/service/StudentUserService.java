package com.example.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.website.domain.User;

@Service
public class StudentUserService implements UserService {

	@Autowired
	User studentUser;
	
	@Override
	public User getUser() {
		return studentUser;
	}

	@Override
	public int signUp(String name, String gender, String location, String college) {
		boolean isStudentcreated = studentUser.createUser(name, gender, location, college);
		if(isStudentcreated) {
			return studentUser.saveUser();
		}else {
			return -1;
		}
		
		//return isStudentcreated;	
	}

}

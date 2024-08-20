package com.sushilPal6.codingNinjaApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PaidCourse implements Course {
	
	String courseName;
	Instructor courseInstructor;

	@Autowired
	@Qualifier("javaInstructor")
	Instructor javaInstructor;

	@Autowired
	@Qualifier("springInstructor")
	Instructor springInstructor;

	@Autowired
	UserList userList;

	@Override
	public void setCourseDetails(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public UserList getUserList() {
		return this.userList;
	}

	@Override
	public Instructor getInstructor() {
		return this.courseInstructor;
	}

	@Override
	public String getCourseName() {
		return this.courseName;
	}

	public void setInstructor(String instructorType) {
		if (instructorType == "spring") {
			this.courseInstructor = this.springInstructor;
		}
		if (instructorType == "java") {
			this.courseInstructor = this.javaInstructor;
		}
	}

}



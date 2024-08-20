package com.sushilPal6.codingNinjaApp;

public class PaidCourse implements Course {
	public String courseName;
	public Instructor courseInstructor;
	public UserList userList;

	public PaidCourse(Instructor courseInstructor, UserList userList) {
		this.courseInstructor = courseInstructor;
		this.userList = userList;
	}
	
	@Override
	public void setCourseDetails(String courseName) {
		// TODO Auto-generated method stub
		this.courseName = courseName;
	}

	@Override
	public UserList getUserList() {
		// TODO Auto-generated method stub
		return this.userList;
	}

	@Override
	public Instructor getInstructor() {
		// TODO Auto-generated method stub
		return this.courseInstructor;
	}

	@Override
	public String getCourseName() {
		// TODO Auto-generated method stub
		return this.courseName;
	}

}

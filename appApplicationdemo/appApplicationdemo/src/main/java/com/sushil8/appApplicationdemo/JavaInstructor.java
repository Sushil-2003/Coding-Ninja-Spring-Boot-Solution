package com.sushil8.appApplicationdemo;

public class JavaInstructor implements Instructor {
	
	public String name;
	public String age;

	@Override
	public void setInstructorDetails(String name, String age) {
		// TODO Auto-generated method stub
		this.name = name;
		this.age = age;
	}

	@Override
	public String takeClass() {
		// TODO Auto-generated method stub
		return "Hi my name is " + this.name + " I will be your Java Instructor";
	}
	
	public void init() {
		System.out.println("Java Instructor bean created");
	}
	
	public void destroy() {
		System.out.println("Java Instructor bean about to be destroy");
	}

}

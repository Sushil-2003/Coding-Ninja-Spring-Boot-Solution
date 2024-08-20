package com.sushil9.codingninijaAppDemo;

public class SpringInstructor implements Instructor {

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
		return "Hi my name is " + this.name + " I will be your Spring Instructor";
	}

	public void init() {
		System.out.println("Spring Instructor bean created");
	}
	
	public void destroy() {
		System.out.println("Spring Instructor bean about to be destroy");
	}
}

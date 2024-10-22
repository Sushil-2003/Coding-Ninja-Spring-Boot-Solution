package com.sushilPal6.codingNinjaApp;

import org.springframework.stereotype.Component;

@Component("springInstructor")
public class SpringInstructor implements Instructor {

	String name;
	String age;

	@Override
	public void setInstructorDetails(String name, String age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String takeClass() {
		return "Hi my name is " + 
				this.name + " and I will be your Srping instructor";
	}

	public void init() {
		System.out.println("spring instructor bean created");
	}
	
	public void destroy() {
		System.out.println("spring instructor bean about to be destroyed");
	}
}


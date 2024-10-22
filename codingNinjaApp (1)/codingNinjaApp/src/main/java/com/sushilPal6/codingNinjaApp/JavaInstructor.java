package com.sushilPal6.codingNinjaApp;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("javaInstructor")
public class JavaInstructor implements Instructor {
	
	String name;
	String age;
	
	@Override
	public void setInstructorDetails(String name, String age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String takeClass() {
		return "Hi my name is "+this.name+" and I will be your java"
				+ "instructor";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Java instructor bean created");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Java instructor bean about to be destroyed");
	}

}


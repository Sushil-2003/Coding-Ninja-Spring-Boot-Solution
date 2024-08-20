package com.sushil9.codingninijaAppDemo;

public class SimpleUser implements User {

	public String name;
	public String location;
	public String age;
	public String collegeName;
	@Override
	public void setUserDetails(String name, String age, String location, String collegeName) {
		// TODO Auto-generated method stub
		this.name = name;
		this.age = age;
		this.location = location;
		this.collegeName = collegeName;
	}

	@Override
	public String getUserDetails() {
		// TODO Auto-generated method stub
		return this.name + " age: " + this.age;
	}

}

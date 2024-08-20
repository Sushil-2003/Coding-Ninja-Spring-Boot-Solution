package com.sushil.testingSpringdemo;

public class longTable implements Table {
	
	double height;
	double length;
	public longTable() {
		// TODO Auto-generated constructor stub
		this.height = 89.5;
		this.length = 99.5;
	}

	@Override
	public String showDetails() {
		// TODO Auto-generated method stub
		return "this table has height " + this.height + " and length " + this.length;
	}

}

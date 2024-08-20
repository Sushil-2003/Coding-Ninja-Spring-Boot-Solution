package com.sushil.testingSpringdemo;

public class shortTable implements Table {

	double height;
	double length;
	public shortTable() {
		// TODO Auto-generated constructor stub
		this.height = 15.5;
		this.length = 25.5;
	}
	@Override
	public String showDetails() {
		// TODO Auto-generated method stub
		return "this table has length " + this.height + " and length " + this.length;
	}

}
	
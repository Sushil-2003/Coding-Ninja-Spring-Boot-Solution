package com.codingNinjas.carDealership;

public class Truck implements Car{
	
	String owner;
	Tyre tyre;
	
//	public Truck(Tyre tyre) {
//		this.tyre = tyre;
//	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	@Override
	public String getInfo() {
		return "A Truck"+tyre.getTyreInfo();
	}

	@Override
	public void setOwnerName(String name) {
		this.owner = name;
		
	}

	@Override
	public String getOwnerName() {
		return this.owner;
	}

}

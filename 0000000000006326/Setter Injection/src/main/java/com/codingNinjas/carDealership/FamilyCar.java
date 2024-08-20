package com.codingNinjas.carDealership;

public class FamilyCar implements Car {
     
	String owner;
	Tyre tyre;
	
	public FamilyCar(Tyre tyre) {
		this.tyre = tyre;
	}
	
	@Override
	public String getInfo() {
		return "A family Car"+tyre.getTyreInfo();
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

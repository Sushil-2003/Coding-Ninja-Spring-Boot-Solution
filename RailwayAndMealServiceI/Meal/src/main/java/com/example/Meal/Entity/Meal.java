package com.example.Meal.Entity;

public class Meal {	
	
	private long pnr;
	private String mealType = "North Indian";
	private boolean premium = false;
	private String mealTime = "Lunch";
	
	public Meal() {
		
	}
	
	public Meal(long pnr) {
		this.pnr = pnr;
	}
	
	public Meal(long pnr, String mealType, boolean premium, String mealTime) {
		this.pnr = pnr;
		this.mealType = mealType;
		this.premium = premium;
		this.mealTime = mealTime;
	}

	public long getPnr() {
		return pnr;
	}
	public void setPnr(long pnr) {
		this.pnr = pnr;
	}
	public String getMealType() {
		return mealType;
	}
	public void setMealType(String mealType) {
		this.mealType = mealType;
	}
	public boolean isPremium() {
		return premium;
	}
	public void setPremium(boolean premium) {
		this.premium = premium;
	}
	public String getMealTime() {
		return mealTime;
	}
	public void setMealTime(String mealTime) {
		this.mealTime = mealTime;
	}

}

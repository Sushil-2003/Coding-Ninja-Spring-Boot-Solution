package com.sushil.taxApplication;

public class PropertyTax implements Tax {
	private double amount;
	private boolean isTaxPayed;
	private double taxAmount;

	@Override
	public void setTaxableAmount(double amount) {
		// TODO Auto-generated method stub
		this.amount = amount;

	}

	@Override
	public void calculateTaxAmount() {
		// TODO Auto-generated method stub
		taxAmount = amount * 0.05;

	}

	@Override
	public double getTaxAmount() {
		// TODO Auto-generated method stub
		return taxAmount;
	}

	@Override
	public String getTaxType() {
		// TODO Auto-generated method stub
		return "Property Tax";
	}

	@Override
	public boolean isTaxPayed() {
		// TODO Auto-generated method stub
		return isTaxPayed;
	}

	@Override
	public void payTax() {
		// TODO Auto-generated method stub
		isTaxPayed = true;
			System.out.println("Hello, your Property Tax is paid.");

	}

}

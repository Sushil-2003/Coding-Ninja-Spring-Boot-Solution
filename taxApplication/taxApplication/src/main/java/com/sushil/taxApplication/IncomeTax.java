package com.sushil.taxApplication;

public class IncomeTax implements Tax {
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
		if(amount <= 300000) {
			taxAmount = 0;
		}else if(amount >= 300000 && amount < 600000){
			taxAmount = amount * 0.05;
		}else if(amount >= 600000 && amount < 900000) {
			taxAmount = amount * 0.1;
		}else if(amount >= 900000 && amount < 1200000) {
			taxAmount = amount * 0.15;
		}else if(amount > 1200000 && amount < 1500000) {
			taxAmount = amount * 0.20;
		}else {
			taxAmount = amount * 0.30;
		}
	}

	@Override
	public double getTaxAmount() {
		// TODO Auto-generated method stub
		return taxAmount;
	}

	@Override
	public String getTaxType() {
		// TODO Auto-generated method stub
		return  "Income Tax";
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
		System.out.println("Hello, your Income Tax is paid");
//		}else {
//			System.out.println("Hello, your Income Tax is not paid");
//		}
	}

}

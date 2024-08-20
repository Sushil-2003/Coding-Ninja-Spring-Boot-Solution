package com.sushil.taxApplication;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TaxApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	SpringApplication.run(TaxApplication.class, args);
		Scanner s = new Scanner(System.in);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Tax incomeTax = (Tax) context.getBean("IncomeTax");
		Tax propertyTax = (Tax) context.getBean("PropertyTax");
		double amount = 800000;
		incomeTax.setTaxableAmount(amount);
		incomeTax.calculateTaxAmount();
		incomeTax.calculateTaxAmount();
		
		propertyTax.setTaxableAmount(amount);
		propertyTax.calculateTaxAmount();
		propertyTax.calculateTaxAmount();
		//boolean isTaxPayed = false;
		System.out.println(incomeTax.getTaxAmount() + " " + incomeTax.getTaxType() + " " + incomeTax.isTaxPayed());
		System.out.println(propertyTax.getTaxAmount() + " " + propertyTax.getTaxType() + " " + propertyTax.isTaxPayed());
		context.close();
		s.close();
	}
	
}

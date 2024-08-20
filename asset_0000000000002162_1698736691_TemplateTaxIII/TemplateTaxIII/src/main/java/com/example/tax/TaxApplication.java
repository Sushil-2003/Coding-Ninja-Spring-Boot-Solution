package com.example.tax;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class TaxApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Tax Payment Application");
		while (true) {
			System.out.println("Please select which tax you want to pay: \n1. Income \n2. Property\n3. Exit");
			int userChoice = scanner.nextInt();
			String taxChoice = "";
			switch (userChoice) {
				case 1 -> taxChoice = "incomeTax";
				case 2 -> taxChoice = "propertyTax";
				case 3 -> {
					System.out.println("Exiting...");
					return;
				}
				default -> {
					System.out.println("Invalid choice");
					return;
				}
			}
			Tax tax = (Tax) context.getBean(taxChoice);
			/*
			1. Check if the tax is already paid, if yes print the message:
			    "You have already paid Income/Property(get this getTaxType() interface method) tax."
			2. If the tax is not paid:
				a. Take the input of taxableAmount from the user.
				b. Set the taxableAmount using setTaxableAmount() interface method.
				c. Calculate the taxAmount using calculateTaxAmount() interface method.
				d. Ask user if he wants to pay the tax. if yes call the payTax() method.
			 */
			if(tax.isTaxPayed()) {
				System.out.println("You have already paid" + tax.getTaxType() + "tax");
			}else {
				System.out.println("Enter the tax amount:");
				int amount = scanner.nextInt();
				tax.setTaxableAmount(amount);
				tax.calculateTaxAmount();
				System.out.println("Do you want to pay the tax? (yes/no)");
                String payChoice = scanner.next();

                if ("yes".equalsIgnoreCase(payChoice)) {
                    // Call the payTax() method to pay the tax
                    tax.payTax();
                } else {
                    System.out.println("You chose not to pay the tax at this moment.");
                }
			}
		}
	}
}

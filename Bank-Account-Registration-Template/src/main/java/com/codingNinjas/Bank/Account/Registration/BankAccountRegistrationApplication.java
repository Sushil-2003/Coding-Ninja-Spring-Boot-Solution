package com.codingNinjas.Bank.Account.Registration;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BankAccountRegistrationApplication {

	public static void main(String[] args) {

		/*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.
		
		* 1. Fetch context from ApplicationContext.xml and initiate scanner.
		* 2. Get user details from console.
		* 3. Get account details from user and add them to the account list.
		* 4. Display the list of accounts with their reference ids.
		*/
		ApplicationContext  context = SpringApplication.run(BankAccountRegistrationApplication.class, args);
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.codingNinjas.Bank.Account.Registration");

        // Get the user bean
        User user = context.getBean(User.class);

        // Set user details
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Account Registration Application!");
        System.out.println("Please enter your name?");
        String userName = scanner.nextLine();
        user.setUserDetails(userName);

        // Add accounts
        while (true) {
            System.out.println("Do you want to add more account?\n1. Yes\n2. No");
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Please select the account type:\n1. Current\n2. Savings");
                int accountType = scanner.nextInt();
                Account account;
                if (accountType == 1) {
                    account = context.getBean(currentAccount.class);
                } else if (accountType == 2) {
                    account = context.getBean(savingsAccount.class);
                } else {
                    System.out.println("Invalid account type");
                    continue;
                }

                System.out.println("Enter the opening balance:");
                double balance = scanner.nextDouble();
                account.addBalance(balance);
                user.addAccount(account);

            } else if (input == 2) {
                break;
            } else {
                System.out.println("Invalid Choice");
            }
        }

        // Display all accounts
        System.out.println("Hi " + user.getName() + ", here is the list of your accounts:");
        for (Account account : user.getAllAccounts()) {
            System.out.println(account.getAccountType() + " : opening balance - " + account.getBalance() + " Reference Id:" + account);
        }
        
        scanner.close();
        //context.close();
	}

}

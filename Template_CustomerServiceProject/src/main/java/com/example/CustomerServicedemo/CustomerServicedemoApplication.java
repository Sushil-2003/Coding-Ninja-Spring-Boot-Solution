package com.example.CustomerServicedemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Customers.CustomerCare;

import java.util.*;

@SpringBootApplication
public class CustomerServicedemoApplication {

	public static void main(String[] args) {

		/*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.

			 Tasks:
		 *  1. Load the beans from ApplicationContext.xml
		 *  2. Display all the departments available and get the input from user.
		 *  3. Get the message from user and store it into the respective department.
		 *  
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Tax Payment Application");
        
        while (true) {
            System.out.println("Please select which department you want to contact: \n1. Payment \n2. Query\n3. Sales\n4. Exit");
            int userChoice = s.nextInt();
            s.nextLine(); // Consume newline
            String departmentChoice = "";
            switch (userChoice) {
                case 1 -> departmentChoice = "PaymentDepartment";
                case 2 -> departmentChoice = "QueryDepartment";
                case 3 -> departmentChoice = "SalesDepartment";
                case 4 -> {
                    System.out.println("Exiting...");
                    context.close();
                    return;
                }
                default -> {
                    System.out.println("Invalid choice");
                    context.close();
                    return;
                }
            }

            CustomerCare department = (CustomerCare) context.getBean(departmentChoice);
            System.out.println("Please enter your name: ");
            String name = s.nextLine();
            department.setCustomerName(name);

            System.out.println(department.getService());

            System.out.println("Please describe your issue: ");
            String issue = s.nextLine();
            department.setProblem(issue);

            System.out.println(department.getProblem());
        }
	}
}

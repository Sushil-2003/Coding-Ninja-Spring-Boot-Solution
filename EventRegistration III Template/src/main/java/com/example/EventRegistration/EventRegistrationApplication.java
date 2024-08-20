package com.example.EventRegistration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class EventRegistrationApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		College college = (College) context.getBean("college");
		System.out.println("Welcome to the Graduation Ceremony Registration Application for " + college.getCollegeName());
		CollegeEvent event = college.getEvent();
		event.printEventDetails();
		while (true) {
			System.out.println("Do you want to register for the ceremony\n1. Yes\n2. No");
			int input = scanner.nextInt();
			if (input == 1) {
				System.out.println("Please enter your name");
				scanner.nextLine();
				String name = scanner.nextLine();
				System.out.println("Please enter your department");
				String department = scanner.nextLine();
				System.out.println("In which year did you pass out?");
				int batch = scanner.nextInt();
				Attendee user = (Attendee) context.getBean("student");
				user.setAttendeeDetails(name, department, batch);
				event.registerStudent(user);
				user.printRegistrationConfirmation();
			} else if(input == 2) {
				break;
			} else {
				System.out.println("Invalid Choice");
				return;
			}
		}

		System.out.println("No. of attendees registered are: " + event.getAttendeeCount());
		System.out.println("The list of attendees are:");
		for(Attendee attendee : event.getAllAttendees()){
			int userReferenceLength = attendee.toString().length(); //46
			System.out.println(attendee.getAttendeeName() + "\t Reference id: " + attendee.toString().substring(userReferenceLength - 9, userReferenceLength));
		}
		// close the context.
	}

}

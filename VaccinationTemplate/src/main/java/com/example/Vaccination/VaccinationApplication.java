package com.example.Vaccination;

import java.util.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class VaccinationApplication {

    public static void main(String[] args) {

        /*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.

		 Tasks:
		1. Fetch context from ApplicationContext.xml and initiate Scanner.
		2. Fetch vaccine and User type choice.
		3. Get the required bean from context.
		4. Get the appointment details form user
		5. Display the appointment details
		6. Run the loop again to book for another user or else exit.
		 */
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	Scanner scanner = new Scanner(System.in);

        while (true) {
        	System.out.println("Wellcome to the vaccination application");
        	System.out.println("Please choose your vaccine preference: \n1. Covid\n2. Polio\n3. Typhoid");
            int vaccineChoice = scanner.nextInt();
            System.out.println("Whom do you want to Vaccinate: \n1. Father\n2. Mother\n3. Self\n4. Spouse\n5.Exit");
            int userTypeChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            User user = null;
            String userType = "";
            String vaccineType = "";

            switch (vaccineChoice) {
                case 1:
                    vaccineType = "Covid";
                    break;
                case 2:
                    vaccineType = "Polio";
                    break;
                case 3:
                    vaccineType = "Typhoid";
                    break;
                default:
                    System.out.println("Invalid user type choice. Exiting.");
                    return;
            }

            switch (userTypeChoice) {
                case 1:
                    userType = "father";
                    break;
                case 2:
                    userType = "Mother";
                    break;
                case 3:
                    userType = "self";
                    break;
                case 4:
                    userType = "spouse";
                    break;
                case 5:
                    userType = "Exit";
                    break;
                default:
                    System.out.println("Invalid vaccine choice. Exiting.");
                    return;
            }

            String beanId = userType + vaccineType;
            user = (User) context.getBean(beanId);

            System.out.println("Please enter your " + userType + "details : ");
            System.out.println("Name:");
            String name = scanner.nextLine();
            System.out.println("Age:");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Appointment date(YYYY-MM-DD): ");
            String date = scanner.nextLine();
            System.out.println("Appointment time(HH:MM (AM/PM): ");
            String timeSlot = scanner.nextLine();
            System.out.println("Appointment location: ");
            String location = scanner.nextLine();
          
            TimeAndLocation timeAndLocation = (TimeAndLocation) context.getBean("timeAndLocation");
            timeAndLocation.setDate(date);
            timeAndLocation.setTimeSlot(timeSlot);
            timeAndLocation.setLocation(location);
            //String updateTimeAndLocation = timeAndLocation.getdetails();
            user.setUserDetails(name, age, timeAndLocation);
            user.setAppointment();

            System.out.printf("Do you want to registar for someone else?");
            System.out.println("\n1. Yes\n2. No");
            int continueChoice = scanner.nextInt();
            if(continueChoice == 2) {
            	break;
            }
        }
    }
}
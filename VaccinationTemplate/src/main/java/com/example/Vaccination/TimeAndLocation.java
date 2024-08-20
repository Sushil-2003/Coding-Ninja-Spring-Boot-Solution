package com.example.Vaccination;

/**
  TimeAndLocation class is a class which a user can use to set its appointment details
  from the console.This class should be injected as a dependency into the selected user.
  To complete this class you need perform the following tasks:
   
        Tasks:
 1.Add common attributes as mentioned below:
  a. String timeSlot
  b. String location
  c. String date
 2. Implement below function based on the given description:
    a. setDetails(String timeSlot, String location, String date): This method takes timeSlot, location, and date as input parameters.
    b. getDetails(): This method returns a string containing the timeslot, location, and date for example: "12:00 AM at New Delhi on 2023-05-22". 

**/ 
public class TimeAndLocation {
	public String timeSlot;
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String location;
	public void setLocation(String location) {
		this.location = location;
	}

	public String date;
	
	public void setDate(String date) {
		this.date = date;
	}

	public String getdetails() {
		return timeSlot + " at " + location + " on " + date;
	}
}

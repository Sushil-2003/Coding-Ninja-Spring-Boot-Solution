package com.example.EventRegistration;

import java.util.ArrayList;
import java.util.List;

public class GraduationCeremonyEvent implements CollegeEvent{
	public Attendee attendee;
	public String name = "Graduation Ceremony";
    public int count = 0;
	public List<Attendee> eventAttendees = new ArrayList<>();
	public String date = "12 NOV 2023";
	public String time = "10 AM";
	public String address = "Auditorium";

	@Override
	public void registerStudent(Attendee user) {
		// TODO Auto-generated method stub
		eventAttendees.add(user);
		count++;
	}

	@Override
	public List<Attendee> getAllAttendees() {
		// TODO Auto-generated method stub
		return eventAttendees;
	}

	@Override
	public void printEventDetails() {
		// TODO Auto-generated method stub
		System.out.println("The Graduation Ceremony details are as follows:");
        System.out.println("Venue: " + address);
        System.out.println("Time: " + time);
        System.out.println("Date: " + date);
	}

	@Override
	public int getAttendeeCount() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public void setAttendee(Attendee attendee) {
		// TODO Auto-generated method stub
		this.attendee = attendee;
	}

    /*
    1. Create the following attributes:
        a. name (initialize it as "Graduation Ceremony".
        b. address (String)
        c. time (String)
        d. date (String)
        e. count (int) (initially 0)
        f. eventAttendees (List of Attendee)
        NOTE: Initialize the address, time and date attributes with some values.
    2. Inject Attendee with attribute name "attendee" with setter injection.
    3. Make this class an implementation of CollegeEvent interface and override the interface methods.
    */

}

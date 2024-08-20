package com.example.EventRegistration;

import java.util.ArrayList;
import java.util.List;

public class GraduationCeremonyEvent implements CollegeEvent {

    private final String name = "Graduation Ceremony";
    private final String address = "Auditorium";
    private final String time = "10AM";
    private final String date = "12 Nov 2023";
    private int count = 0;
    private Attendee attendee;


    /*
         1. Create custom init() and destroy() methods.
         2. The init() method should print the message "Graduation Ceremony bean created!!".
         3. The destroy() method should print the message "Graduation Ceremony bean destroyed".
     */
    public void init() {
    	System.out.println("Graduation Ceremony bean created!!");
    }

    public void destroy() {
    	System.out.println("Graduation Ceremony bean destroyed");
    }
    private final List<Attendee> eventAttendees = new ArrayList<>();

    @Override
    public void registerStudent(Attendee user) {
        count++;
        eventAttendees.add(user);
    }

    @Override
    public List<Attendee> getAllAttendees() {
        return eventAttendees;
    }

    @Override
    public void printEventDetails() {
        System.out.println("The " + name + " details are as follows: " + "\nVenue: " + address + "\nTime: " + time + "\nDate: " + date);
    }

    @Override
    public int getAttendeeCount() {
        return count;
    }

    @Override
    public void setAttendee(Attendee attendee) {
        this.attendee = attendee;
    }
}

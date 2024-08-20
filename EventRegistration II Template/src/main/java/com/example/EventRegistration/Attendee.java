package com.example.EventRegistration;

public interface Attendee {

    void setAttendeeDetails(String name, String department, int batch);
    void printRegistrationConfirmation();
    String getAttendeeName();
}

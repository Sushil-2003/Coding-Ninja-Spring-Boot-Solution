package com.example.EventRegistration;

public interface Attendee {

    // This method sets the details of the Attendee.
    void setAttendeeDetails(String name, String department, int batch);

    /* This method prints the Registration Confirmation
        For example, if the Attendee's name is John, the confirmation statement is as follows:
        Hi John, your registration for the Graduation Ceremony is successful
     */
    void printRegistrationConfirmation();

    // This method returns the Attendee's name.
    String getAttendeeName();
}

package com.example.EventRegistration;

import java.util.List;

public interface CollegeEvent {

    /*
       This method registers attendee for the ceremony i.e. it adds the
       attendee to the eventAttendees list and increases the AttendeeCount attribute
       which is the count of attendee attending the event.
     */
    void registerStudent(Attendee user);

    /*
        This method returns the list af attendees.
     */
    List<Attendee> getAllAttendees();

    /*
    This method prints the event details.
    For example: "The Graduation Ceremony details are as follows:
                 Venue: Auditorium
                 Time: 10AM
                 Date: 12 Nov 2023"
     */
    void printEventDetails();

    // This method returns the attendeeCount.
    int getAttendeeCount();

    // This method sets the attendee.
    void setAttendee(Attendee attendee);
}

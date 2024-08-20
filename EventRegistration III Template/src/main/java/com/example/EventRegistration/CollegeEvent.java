package com.example.EventRegistration;

import java.util.List;

public interface CollegeEvent {
    void registerStudent(Attendee user);
    List<Attendee> getAllAttendees();
    void printEventDetails();
    int getAttendeeCount();
    void setAttendee(Attendee attendee);
}

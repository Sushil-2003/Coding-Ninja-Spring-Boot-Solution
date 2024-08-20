package com.example.EventRegistration;

public class MyCollege implements College{


    private String name = "IIT Bombay";
    CollegeEvent event;

    /*
         1. Create custom init() and destroy() methods.
         2. The init() method should print the message "MyCollege bean created!!".
         3. The destroy() method should print the message "MyCollege bean destroyed".
     */
    public void init() {
    	System.out.println("MyCollege bean created!!");
    }

    public void destroy() {
    	System.out.println("MyCollege bean destroyed");
    }
    public void setEvent(CollegeEvent event) {
        this.event = event;
    }

    @Override
    public String getCollegeName() {
        return name;
    }

    @Override
    public CollegeEvent getEvent() {
        return event;
    }

}

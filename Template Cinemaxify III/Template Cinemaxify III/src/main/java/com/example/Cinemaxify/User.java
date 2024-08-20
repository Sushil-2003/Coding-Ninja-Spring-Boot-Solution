package com.example.Cinemaxify;

public interface User {
    void setUserDetails(String name, int age, Long contact, String address);
    void getUserDetails();
    Plan getUserPlan();
}

package com.example.Cinemaxify;

public class Spouse implements User{

    private String name;
    private String memberName = "spouse";
    private int age;
    private Long contact;
    private String address;
    private Plan plan;

    // Add setPlan(Plan plan) method which sets plan attribute:

    public void setPlan(Plan plan) {
		this.plan = plan;
	}

	@Override
    public void setUserDetails(String name, int age, Long contact, String address) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.address = address;
    }

    @Override
    public void getUserDetails() {
        System.out.println("Hello " + name + " you have entered the following details:");
        System.out.println("age: " +age + "\ncontact: " + contact + "\naddress: " +address);
        System.out.println("You have selected a "+ plan.getPlanName() + " plan for " + memberName);
    }

    @Override
    public Plan getUserPlan() {
        return plan;
    }
}

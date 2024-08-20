
package com.example.Customers;

public interface CustomerCare {

	/** This method returns the name of the Department Selected by the user. **/
	String getDepartment();

	/** This method returns the prompt to the user to welcome the user with the given name, and department selected and ask for the issue e.g. " Welcome John, you have reached the payments department". **/
	void getService();
	
	/** This method sets the name of the user from the console. **/
	void setCustomerName(String name);
	
	/** This method sets the issue for the department given by the user e.g. "I have an issue with my receipt". **/
	void setProblem(String problem); 
	
	/** This method returns the custom response to the user based on the name and the selected department. e.g. " Dear John your  issue is registered with Payments" **/
	void getProblem(); 

}

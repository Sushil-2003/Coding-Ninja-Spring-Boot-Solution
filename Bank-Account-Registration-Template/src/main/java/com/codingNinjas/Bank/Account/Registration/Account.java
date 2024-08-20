package com.codingNinjas.Bank.Account.Registration;


public interface Account {

    /** This method returns the type of Account in string format, for example "Current Account". **/
    String getAccountType();

    /** This method increments the value for the balance attribute based on the user input.for example, 
        if the initial value of the balance was 10 and the user inputs opening balance as 10, then the 
        updated value for the balance variable will be 20.Now if the user again inputs the value of opening balance as
        10, then the updated value of balance, now will be 30.  
    **/
    void addBalance(double balance);

    /** This method returns the balance amount in double format. **/
    double getBalance();
}

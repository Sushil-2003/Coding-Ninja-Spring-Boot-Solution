package com.codingNinjas.Bank.Account.Registration;

import java.util.List;

public interface User {

    /** This method sets the name attribute. **/
    void setUserDetails(String name);

    /** This method adds an account to the accountList. **/
    void addAccount(Account account);

    /** This method retrieves the complete list of accounts including savings and current. **/
    List<Account> getAllAccounts();

    /** This method returns the name attribute. **/
    String getName();
}

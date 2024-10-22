package com.codingNinjas.Bank.Account.Registration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/**
  This class is an implementation of a User Interface based on the selection 
  done in the console for user information.You need to complete this class 
  based on the following tasks.

   a. Adding common attributes: 
       1. String name
       2. List<Account> accountList.
   b. Override the methods of User Interface.
   c. Build the logic for all the methods based on the description mentioned in the Account Interface.

**/

@Component
@Scope("singleton")
public class myUser implements User{
	
	public String name;
    public List<Account> accountList = new ArrayList<>();
    
    @PostConstruct
    public void init() {
        System.out.println("User bean is going through init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("User bean will be destroyed now.");
    }
    
	@Override
	public void setUserDetails(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void addAccount(Account account) {
		// TODO Auto-generated method stub
		accountList.add(account);
	}

	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accountList;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}

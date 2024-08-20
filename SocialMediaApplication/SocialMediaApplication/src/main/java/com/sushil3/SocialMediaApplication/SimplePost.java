package com.sushil3.SocialMediaApplication;

public class SimplePost implements Post {
	
	String message;
	
	public void destroy() {
		System.out.println("Post are destroy");
	}

	@Override
	public void setMessage(String message) {
		// TODO Auto-generated method stub
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}

}

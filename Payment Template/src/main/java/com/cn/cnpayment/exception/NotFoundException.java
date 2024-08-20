package com.cn.cnpayment.exception;

// Add annotation for returning BAD_REQUEST as the response status for this class.
public class NotFoundException extends RuntimeException{

    // Complete the method body for passing custom message.
    public NotFoundException(String message){
    	super(message);
    }
}

package com.cn.cnpayment.exception;

// Add annotation for returning BAD_REQUEST as the response status for this class.
public class InvalidInputException extends RuntimeException{

    // Complete the method body for passing custom message.
    public InvalidInputException(String message){
    	super(message);
    }
}

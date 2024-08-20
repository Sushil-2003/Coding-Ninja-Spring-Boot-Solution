package com.cn.cnpayment.exception;

// Add annotation for returning BAD_REQUEST as the response status for this class.
public class ElementAlreadyExistException extends RuntimeException{

    // Complete the method body for passing custom message.
    public ElementAlreadyExistException(String message){
    	super(message);
    }

}

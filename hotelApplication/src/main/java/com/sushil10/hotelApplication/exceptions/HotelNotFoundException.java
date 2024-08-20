package com.sushil10.hotelApplication.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class HotelNotFoundException extends RuntimeException{

	public HotelNotFoundException(String message) {
		super(message);
		
	}
}

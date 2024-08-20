package com.example.Meal.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MealWithPnrAlreadyExists extends RuntimeException {
	
	public MealWithPnrAlreadyExists(String message){
		super(message);
	}
	
}

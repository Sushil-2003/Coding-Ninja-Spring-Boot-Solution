package railway.com.example.RailwayAndMeal.exceptions;

/**
    1. Add proper annotation for this custom exception class
    2. It returns a response status of type CONFLICT.
**/

public class TicketAlreadyExistsException extends RuntimeException{
	public TicketAlreadyExistsException(String message) {
		super(message);
	}
}
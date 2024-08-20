package railway.com.example.RailwayAndMeal.exceptions;

/**
 1. Add proper annotation for this custom exception class
 2. It returns a response status of type NOT_FOUND.
 **/
public class TicketNotFoundException extends RuntimeException
{

	public TicketNotFoundException(String message) {
		super(message);
	}

}


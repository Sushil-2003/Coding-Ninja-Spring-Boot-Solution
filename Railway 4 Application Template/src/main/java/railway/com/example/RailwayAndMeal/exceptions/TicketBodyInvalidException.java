package railway.com.example.RailwayAndMeal.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
     1. Add proper annotation for this custom exception class
     2. It returns a response status of type BAD_REQUEST.
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TicketBodyInvalidException extends RuntimeException {

    //complete the method body for TicketBodyInvalidException constructor
    public TicketBodyInvalidException(String message) {
    	super(message);
    }
}

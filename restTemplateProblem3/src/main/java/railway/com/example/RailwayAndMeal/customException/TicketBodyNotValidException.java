package railway.com.example.RailwayAndMeal.customException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TicketBodyNotValidException extends RuntimeException{
	
	public TicketBodyNotValidException(String message){
		super(message);
	}
}

package railway.com.example.RailwayAndMeal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import railway.com.example.RailwayAndMeal.Entity.Ticket;
import railway.com.example.RailwayAndMeal.exceptions.TicketBodyInvalidException;
import railway.com.example.RailwayAndMeal.service.RailwayService;

@RestController
@RequestMapping("/railway")
public class Controller {

	@Autowired
	private RailwayService railwayservice;		



	//add annotations in the method parameter to validate the request body as designed in the entity class.
	//add annotation for handling error if the data is invalid using the BindingResult class.
	@PostMapping("/ticket")
	public void addTicket(@Valid @RequestBody Ticket ticket, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			throw new TicketBodyInvalidException("Ticket body is Not Valid");
		}
		railwayservice.addTicket(ticket);
	}
	@GetMapping("/tickets")
	public List<Ticket> getAllTickets(){
		return railwayservice.getAllTickets();
	}
	
	@GetMapping("/ticket/{pnr}")
	public Ticket getTicketByPnr(@PathVariable long pnr) {
		
		return railwayservice.getTicketByPnr(pnr);
	}
	
	@DeleteMapping("/ticket/{pnr}")
	public void deleteTicket(@PathVariable long pnr) {
		railwayservice.deleteTicketByPnr(pnr);
	}




	//add annotations in the method parameter to validate the request body as designed in the entity class.
	//add annotation for handling error if the data is invalid using the BindingResult class.
	@PutMapping("/ticket")
	public void updateTicket(@Valid @RequestBody Ticket ticket, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			throw new TicketBodyInvalidException("Ticket body is Not Valid");
		}
		railwayservice.updateTicket(ticket);
	}

}

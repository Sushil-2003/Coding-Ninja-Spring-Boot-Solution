package railway.com.example.RailwayAndMeal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import railway.com.example.RailwayAndMeal.Entity.Ticket;
import railway.com.example.RailwayAndMeal.service.RailwayService;

@RestController
@RequestMapping("/railway")
public class Controller {

	@Autowired
	private RailwayService railwayservice;

	@PostMapping("/ticket")
	public void addTicket(@RequestBody Ticket ticket) {
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


	// a. DELETE "/railway/ticket/{pnr}": It deletes a ticket by its pnr.
	@DeleteMapping("/ticket/{pnr}")
	public void deleteTicket(@PathVariable long pnr) {
		railwayservice.deleteTicketByPnr(pnr);
	}


	// b. PUT "/railway/ticket": It updates a ticket by the given data.
	@PutMapping("/ticket")
	public void updateTicket(@RequestBody Ticket ticket) {
		railwayservice.updateTicket(ticket);
	}



}

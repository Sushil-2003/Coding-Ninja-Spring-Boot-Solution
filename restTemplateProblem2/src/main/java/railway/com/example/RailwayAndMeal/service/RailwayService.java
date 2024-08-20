package railway.com.example.RailwayAndMeal.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import railway.com.example.RailwayAndMeal.Entity.Meal;
import railway.com.example.RailwayAndMeal.Entity.Ticket;
import railway.com.example.RailwayAndMeal.communicator.MealServiceCommunicator;
import railway.com.example.RailwayAndMeal.customException.TicketNotFoundException;

@Service
public class RailwayService {
	
	@Autowired
	MealServiceCommunicator mealServiceCommunicator;
	
	public List<Ticket> list = new ArrayList<>();
	public Map<Long,Ticket> ticketMap = new HashMap<>();
	
	public Ticket getTicketByPnr(long pnr) {
		if(ObjectUtils.isEmpty(ticketMap.get(pnr)))
			throw new TicketNotFoundException("Ticket by given PNR does not exist");
		
		Ticket ticket = ticketMap.get(pnr);	
		
		Meal meal = mealServiceCommunicator.getMealByPnr(pnr);
		ticket.setMeal(meal);
		
		return ticket;
	}
	
	public void addTicket(Ticket ticket) {
		/** 
		    Complete the "addTicket()" method by calling "setMeal()" method.
		    Write the logic such that "addTicket()" will save the "meal" object in the 
		   "MealApplication" by using "RestTemplate" 
		**/
		list.add(ticket);
		ticketMap.put(ticket.getPnr(), ticket);
		
		ticket.setMeal(new Meal(ticket.getPnr()));
		
		mealServiceCommunicator.setMeal(ticket.getMeal());

	}
	
	public List<Ticket> getAllTickets() {		
		return list;
	}
	
	public void deleteTicketByPnr(long pnr) {
		Ticket ticket = this.getTicketByPnr(pnr);
		
		list.remove(ticket);
		ticketMap.remove(ticket.getPnr());
	}
	
	public void updateTicket(Ticket ticket) {
		Ticket existing_ticket = this.getTicketByPnr(ticket.getPnr());
		
		list.remove(existing_ticket);
		ticketMap.remove(existing_ticket.getPnr());
		
		list.add(ticket);
		ticketMap.put(ticket.getPnr(), ticket);
	}
}
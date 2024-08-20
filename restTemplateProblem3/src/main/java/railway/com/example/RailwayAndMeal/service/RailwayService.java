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
import railway.com.example.RailwayAndMeal.customException.TicketBodyNotValidException;
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
		ticket.setMeal(new Meal(ticket.getPnr()));
		
		mealServiceCommunicator.setMeal(ticket.getMeal());
		
		list.add(ticket);
		ticketMap.put(ticket.getPnr(), ticket);
	}
	
	public List<Ticket> getAllTickets() {		
		return list;
	}
	/** Complete the "deleteTicket()" method by calling the "deleteMeal()" 
	    method of MealServiceCommunicator" class.
	**/
	public void deleteTicketByPnr(long pnr) {
		Ticket ticket = this.getTicketByPnr(pnr);		
		list.remove(ticket);
		ticketMap.remove(ticket.getPnr());
		mealServiceCommunicator.deleteMeal(pnr);
	}

	/**
	Complete the "updateTicket()" method by calling the "updateMeal()" method of 
	MealServiceCommunicator" class.
	**/
	public void updateTicket(Ticket ticket) {
		Ticket existing_ticket = this.getTicketByPnr(ticket.getPnr());
		list.remove(existing_ticket);
		ticketMap.remove(existing_ticket.getPnr());
		
		list.add(ticket);
		ticketMap.put(ticket.getPnr(), ticket);
		mealServiceCommunicator.updateMeal(ticket.getMeal());
	}
	
	/*
	 * 1. Create a service function to handle UpdateTicketPremium method from Controller.
	 * 2. The service method should update the premium of the given ticket's meal.
	 * 3. The service method should also make a call to the mealServiceCommunicator to update
	 * 		the meal in the meal service.
	 */
	public void updateMealPremium(Ticket ticket, Long pnr ,boolean isPremium){
		if(ticket.getPnr() != pnr) {
			throw new TicketBodyNotValidException("Ticket invalid");
		}
		Ticket existingTicket = this.getTicketByPnr(pnr);
	    Meal meal = existingTicket.getMeal();
	    meal.setPremium(isPremium);
	    mealServiceCommunicator.updateMeal(meal);
	    existingTicket.setMeal(meal);
	    list.remove(ticketMap.get(pnr));
	    list.add(existingTicket);
	    ticketMap.put(pnr, existingTicket);
	}
}
package railway.com.example.RailwayAndMeal.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import railway.com.example.RailwayAndMeal.Entity.Ticket;
import railway.com.example.RailwayAndMeal.exceptions.TicketAlreadyExistsException;
import railway.com.example.RailwayAndMeal.exceptions.TicketNotFoundException;

@Service
public class RailwayService {

	public List<Ticket> list = new ArrayList<>();
	public Map<Long,Ticket> ticketMap = new HashMap<>();

	public Ticket getTicketByPnr(long pnr)
	{
		if (ObjectUtils.isEmpty(ticketMap.get(pnr))){
			throw new TicketNotFoundException("No ticket found with pnr : "+pnr);
		}
		return ticketMap.get(pnr);
	}

	public void addTicket(Ticket ticket) {
		if (!ObjectUtils.isEmpty(ticketMap.get(ticket.getPnr())))
			throw new TicketAlreadyExistsException("Ticket with id : "+ticket.getPnr()+" already exists");
		list.add(ticket);
		ticketMap.put(ticket.getPnr(), ticket);
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
		long pnr=ticket.getPnr();
		list.remove(existing_ticket);
		ticketMap.remove(existing_ticket.getPnr());
		list.add(ticket);
		ticketMap.put(ticket.getPnr(), ticket);
	}
}
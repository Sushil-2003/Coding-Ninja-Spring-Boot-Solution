package com.cn.cnEvent.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.cnEvent.dal.EventDAL;
import com.cn.cnEvent.entity.Event;

@Service
@Transactional
public class EventService {

	@Autowired
	EventDAL eventDAL;
	
	public Event getEventById(Long id) {
        return eventDAL.getById(id);
    }
	
	public List<Event> getAllEvents() {
        return eventDAL.getAllEvents();
    }
	
	public String saveEvent(Event event) {
        eventDAL.save(event);
        return "The event was saved successfully.";
    }
}

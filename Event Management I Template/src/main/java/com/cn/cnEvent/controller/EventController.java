package com.cn.cnEvent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cn.cnEvent.entity.Event;
import com.cn.cnEvent.service.EventService;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
	
	@Autowired
	EventService eventService;
	
	 @GetMapping("/{id}")
	public Event getEventById(@PathVariable Long id) {
		 return eventService.getEventById(id);
	}
	 
	 @GetMapping("/all")
	 public List<Event> getAllEvents() {
	      return eventService.getAllEvents();
	 }
	 
	 @PostMapping("/save")
	 public String addEvent(@RequestBody Event event) {
		 return eventService.saveEvent(event);
	 }
}

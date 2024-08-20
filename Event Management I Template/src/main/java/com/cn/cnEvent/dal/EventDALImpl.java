package com.cn.cnEvent.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cn.cnEvent.entity.Event;

@Repository
@Transactional
public class EventDALImpl implements EventDAL{

	@Autowired
	EntityManager entityManager;
	
	@Override
	public Event getById(Long id) {
		Session session = entityManager.unwrap(Session.class);
		Event event = session.get(Event.class, id);
		return event;
	}

	@Override
	public List<Event> getAllEvents() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("FROM Event", Event.class).getResultList();
	}

	@Override
	public String save(Event item) {
		Session session = entityManager.unwrap(Session.class);
		//Event event = session.save(item);
		return (String)session.save(item);
	}

}

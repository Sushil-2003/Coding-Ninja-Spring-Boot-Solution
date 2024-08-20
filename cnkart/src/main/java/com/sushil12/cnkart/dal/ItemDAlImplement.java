package com.sushil12.cnkart.dal;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sushil12.cnkart.entity.Item;

@Repository
public class ItemDAlImplement implements ItemDAl{

	@Autowired
	EntityManager entityManager;
	
	@Override
	public Item getBYId(int id) {
		Session session = entityManager.unwrap(Session.class);
		Item item = session.get(Item.class, id);
		return item;
	}

	@Override
	public void save(Item item) {
		Session session = entityManager.unwrap(Session.class);
		session.save(item);
	}

	@Override
	public void delete(int id) {
		Session session = entityManager.unwrap(Session.class);
		Item item = session.get(Item.class, id);
		session.delete(item);
	}

	@Override
	public void update(Item updateItem) {
		Session session = entityManager.unwrap(Session.class);
		// fetch the current item details from the DB
		Item currentItem = session.get(Item.class, updateItem.getId());
		// update the details in the current object 
		currentItem.setName(updateItem.getName());
		currentItem.setDescription(updateItem.getDescription());
		//update the DB
		session.update(currentItem);
	}

}

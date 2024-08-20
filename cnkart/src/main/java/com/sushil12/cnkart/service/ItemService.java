package com.sushil12.cnkart.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushil12.cnkart.dal.ItemDAl;
import com.sushil12.cnkart.entity.Item;

@Service
public class ItemService {

	@Autowired
	ItemDAl itemDAl;
	
	@Transactional
	public Item getItemById(int id) {
		return itemDAl.getBYId(id);
	}
	
	@Transactional
	public void saveItem(Item item) {
		itemDAl.save(item);
	}
	
	@Transactional
	public void delete(int id) {
		itemDAl.delete(id);
	}
	
	@Transactional
	public void update(Item updateItem) {
		itemDAl.update(updateItem);
	}

}

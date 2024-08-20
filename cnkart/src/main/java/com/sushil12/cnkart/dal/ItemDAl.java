package com.sushil12.cnkart.dal;

import com.sushil12.cnkart.entity.Item;

public interface ItemDAl {

	Item getBYId(int id);

	void save(Item item);
	
	void delete(int id);

	void update(Item updateItem);

}

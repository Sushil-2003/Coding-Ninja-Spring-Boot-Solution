package com.example.website.repository;

import java.util.Optional;

public interface DAO<T> {
	
	public Optional<T> get(Integer id);
	
	public int save(T t);
}

package com.example.CarService.repository;

public interface DAO<T> {

    // Save method simply adds a car into a list and then returns the size of it as CardId.
    int save(T t);
}

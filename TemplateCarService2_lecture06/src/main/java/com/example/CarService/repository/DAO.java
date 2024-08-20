package com.example.CarService.repository;


public interface DAO<T> {

    int save(T t);
}

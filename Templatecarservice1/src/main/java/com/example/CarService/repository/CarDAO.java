package com.example.CarService.repository;

import com.example.CarService.domain.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAO implements DAO<Car> {
    private List<Car> carList= new ArrayList<>();

    @Override
    public int save(Car car) {
        carList.add(car);
        int carId=carList.size();
        car.setCarId(carId);
        System.out.println("saved details");
        return carId;
    }
}

package com.example.CarService.service;

import com.example.CarService.domain.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarRegistrationService implements Registration{
    @Autowired
    Vehicle Car;
    @Override
    public int registerCar(String vehicleNo, String vehicleName,String CarDetails,String CarWork) {
        Car.createVehicle(vehicleNo,vehicleName,CarDetails,CarWork);
        return Car.saveVehicleDetails();
    }

    @Override
    public Vehicle getNewCar() {
        return Car;
    }
}

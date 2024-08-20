package com.example.CarService.service;

import org.springframework.stereotype.Component;

import com.example.CarService.domain.Vehicle;

/**                                 NOTE:-

 1. Please note method createVehicle() and saveVehicleDetails() belongs to class car due to which it is necessary to Autowire it in class CarRegistrationService.
 2. Autowire car of type Vehicle and use it in method registerCar() and getNewCar().

**/
public interface Registration {

    /** Method registerCar uses createVehicle method for creating a vehicle and based on saveVehicleDetails method it returns true or false. **/
    public Boolean registerCar(String vehicleNo,String vehicleName,String CarDetails,String CarWork);

    /** It simply returns a car of type Vehicle (please refer CarRegistrationService for further explanation). **/
    public Vehicle getNewCar();
}

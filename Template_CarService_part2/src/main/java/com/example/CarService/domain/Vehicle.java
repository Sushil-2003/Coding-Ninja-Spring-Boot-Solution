package com.example.CarService.domain;

import org.springframework.stereotype.Component;

@Component
public interface Vehicle {

    
    public Boolean saveVehicleDetails();

    
    public void createVehicle(String RegistrationNumber,String CarName,String CarDetails ,String WorkDone);
}

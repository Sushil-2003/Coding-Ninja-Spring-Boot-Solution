package com.example.CarService.domain;

public interface Vehicle {
    
    public int saveVehicleDetails();

    public void createVehicle(String RegistrationNumber,String CarName,String CarDetails ,String WorkDone);
}

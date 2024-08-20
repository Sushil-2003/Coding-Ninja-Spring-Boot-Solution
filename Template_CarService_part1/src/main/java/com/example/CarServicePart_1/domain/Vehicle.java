package com.example.CarServicePart_1.domain;

public interface Vehicle {

/** saveVehicleDetails saves the vehicle and return true or false accordingly. **/
 public Boolean saveVehicleDetails();


/** createVehicle method uses the setter method of domain object car to set value of its attributes. **/
 public void createVehicle(String RegistrationNumber,String CarName,String CarDetails ,String WorkDone);

}

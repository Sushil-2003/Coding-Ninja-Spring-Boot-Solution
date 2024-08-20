package com.example.CarService.domain;

import com.example.CarService.repository.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Autowired
    DAO<Car> carDAO;
    String RegisterationNumber;
    String CarName;
    String CarDetails;
    String CarWork;

    Integer CarId;

    public Integer getCarId() {
        return CarId;
    }

    public void setCarId(Integer carId) {
        CarId = carId;
    }

    public String getRegisterationNumber() {
        return RegisterationNumber;
    }

    public void setRegisterationNumber(String registerationNumber) {
        RegisterationNumber = registerationNumber;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public String getCarDetails() {
        return CarDetails;
    }

    public void setCarDetails(String carDetails) {
        CarDetails = carDetails;
    }

    public String getCarWork() {
        return CarWork;
    }

    public void setCarWork(String carWork) {
        CarWork = carWork;
    }



    /** 
       # Modify the below function based on the needs:
       1. The method saveVehicleDetails should return cardId as its return type, here carDAO save method returns 
          the cardId of newly added car.
       2. If RegisterationNumber,CarName or CarDetails is found null then the return type for saveVehicleDetails
          method should be -1.
    **/ 
    
    @Override
    public int saveVehicleDetails() {
    	System.out.println(this.CarName);
		return carDAO.save(this);
    }

    @Override
    public void createVehicle(String RegistrationNumber, String CarName,String CarDetails,String CarWork ) {
        this.setRegisterationNumber(RegistrationNumber);
        this.setCarName(CarName);
        this.setCarDetails(CarDetails);
        this.setCarWork(CarWork);
    }
}

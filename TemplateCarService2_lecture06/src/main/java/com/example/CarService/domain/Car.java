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


    @Override
    public int saveVehicleDetails() {
        if(RegisterationNumber!=null && CarName!=null && CarDetails!=null){
            int carId = carDAO.save(this);
            System.out.println("new car added"+this.CarName+"  "+this.RegisterationNumber+this.CarDetails);
            return carId;
        }
        else {
            return -1;
        }
    }

    @Override
    public void createVehicle(String RegistrationNumber, String CarName,String CarDetails,String CarWork ) {
        this.setRegisterationNumber(RegistrationNumber);
        this.setCarName(CarName);
        this.setCarDetails(CarDetails);
        this.setCarWork(CarWork);
    }
}

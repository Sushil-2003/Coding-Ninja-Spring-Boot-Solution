package com.example.CarServicePart_1.domain;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

/**

 1. Domain Model is already created for you, just generate getter and setter.
 2. Also,Implement the interface Vehicle and Override the method saveVehicleDetails() and createVehicle() in car.
**/
    String RegisterationNumber;
    String CarName;
    String CarDetails;
    String CarWork;
    Integer CarId;
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
	public Integer getCarId() {
		return CarId;
	}
	public void setCarId(Integer carId) {
		CarId = carId;
	}
	@Override
	public Boolean saveVehicleDetails() {
		System.out.println(this.CarDetails);
		return true;
	}
	@Override
	public void createVehicle(String RegistrationNumber, String CarName, String CarDetails, String WorkDone) {
		this.RegisterationNumber = RegistrationNumber;
		this.CarDetails = CarDetails;
		this.CarName = CarName;
		this.CarWork = WorkDone;
	}

}

package com.example.CarService.web;

import com.example.CarService.domain.Car;
import com.example.CarService.domain.Vehicle;
import com.example.CarService.service.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
    @Autowired
    Registration registration;

    @RequestMapping(value = "/register")
    public String getRegistrationPage(Model carModel){
        Vehicle vehicle=registration.getNewCar();
        carModel.addAttribute("Vehicle",vehicle);
        return "carregister";
    }
    @RequestMapping(value = "/done")
    public String getResponsePage(@ModelAttribute("vehicle") Car car){
        int carId=registration.registerCar(car.getRegisterationNumber(), car.getCarName(), car.getCarDetails(), car.getCarWork());
        if(carId!=-1){
            ModelAndView modelAndView = new ModelAndView("redirect:success?id="+carId);
            return modelAndView.getViewName();
        }else{
            return "carregister";
        }

    }
    @RequestMapping(value="/success")
    public String getSuccessPage(@RequestParam String id) {
        return "success";
    }
    
}

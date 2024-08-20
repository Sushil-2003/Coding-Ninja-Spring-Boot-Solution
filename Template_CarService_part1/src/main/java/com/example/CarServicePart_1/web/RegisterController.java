package com.example.CarServicePart_1.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RegisterController {

/** The Function getRegistrationPage() should return string "carregister" for Car register page. **/
    @RequestMapping("/register")
    public String getRegistrationPage(){

        //Write your Logic

        return "carregister";
    }

}
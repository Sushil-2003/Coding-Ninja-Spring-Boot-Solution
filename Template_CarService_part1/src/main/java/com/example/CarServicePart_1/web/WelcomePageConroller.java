package com.example.CarServicePart_1.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WelcomePageConroller {

/** The Function welcomePage() should return string "welcome" for welcome Page. **/

    @RequestMapping("/welcome")
    public String welcomePage(){
       //Write your Logic
        return "welcome";
    }

}

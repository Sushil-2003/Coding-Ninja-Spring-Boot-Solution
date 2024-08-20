package com.example.CarService.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SupportController {

    /**
     1. The method getSupportPage returns string "support" for support page.
     2. Also, the method accepts id of type String & object of type ModelMap as argument.
    **/

    @RequestMapping("/support")
    public String getSupportPage(@RequestParam("id") String id, ModelMap map) {
    	map.addAttribute("message" , "Your car ID" + id);
		return "support";
     }
}

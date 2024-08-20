package com.example.website.web;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.website.domain.StudentUser;
import com.example.website.domain.User;
import com.example.website.service.UserService;

@Controller
public class SignUpController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/signUp")
	public String getSignUpPage(Model uiModel) {
		User user = userService.getUser();
		uiModel.addAttribute("user", user);
		return "signup";
	}
	
	@RequestMapping("/registerUser")
	public String createUser(@ModelAttribute(value = "user") StudentUser studentUser) {
		int userId = userService.signUp(studentUser.getName(), studentUser.getGender(), 
				studentUser.getLocation(), studentUser.getCollege());
		if(userId != -1){
			ModelAndView modelAndView = new ModelAndView("redirect:welcome?id=" + userId);
			return modelAndView.getViewName(); 
		}
		return "signup";
	}
	
	@RequestMapping("/welcome")
	public String showWelcomePage(@RequestParam("id") String userId, ModelMap map) {
		map.addAttribute("userId" ,userId);
		return "welcome";
	}
	
	@RequestMapping("/instructors")
	public String showInstructorsPage(ModelMap map) {
		//creating instructors using hash maps
		HashMap<String, Object> instructor1 = new HashMap<String,Object>();
		instructor1.put("name", "Sushil Pal");
		instructor1.put("age",21);
		instructor1.put("id",243);
		
		//ArrayList for a list of instructors
		ArrayList<HashMap<String, Object>> listOfInstructors = new ArrayList<HashMap<String, Object>>();
		listOfInstructors.add(instructor1);
		
		// sending key value pairs to the view
		map.addAttribute("instructors",listOfInstructors);
		return "instructors";
	}
	
	@RequestMapping("/profile/{profileID}")
	public String ShowProfile(@PathVariable("profileID") String profileID,ModelMap map) {
		map.addAttribute("profileID",profileID);
		return "profile";
	}
	
}

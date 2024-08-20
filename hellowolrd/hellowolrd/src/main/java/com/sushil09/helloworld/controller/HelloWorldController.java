package com.sushil09.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/project")
public class HelloWorldController {

	@GetMapping("/hello")
	public String hello() {
		System.out.println("1233");
		return "Hello Sushil";
	}
}

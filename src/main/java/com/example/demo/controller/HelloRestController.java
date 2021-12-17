package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @RestController: create the rest controller class.
 * @RequestMapping: maps HTTP requests to handler methods of MVC and REST controllers.
 */
@RestController
@RequestMapping("/hello")
public class HelloRestController {

	@RequestMapping(value = {"","/","home"})
	public String sayHello() {
		return "Hello From Bridgelabz";
	}
	
}

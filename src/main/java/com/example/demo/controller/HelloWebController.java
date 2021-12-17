package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/*
 * @Controller:indicate the class is a Spring controller
 */
@Controller
public class HelloWebController {

	/*
	 * @GetMapping: mapping HTTP GET requests onto specific handler methods
	 */
	@GetMapping("/web")
	public String hello() {
		return "hello";
	}
	

	/**
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/web/message")
	public String message(Model model) {
		model.addAttribute("message",
							"This is a custom message, Hello from Bridgelabz");
		return "message";	
	}
}

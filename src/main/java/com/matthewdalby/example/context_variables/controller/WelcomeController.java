package com.matthewdalby.example.context_variables.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matthewdalby.example.context_variables.service.Service1;

@RestController
public class WelcomeController {
	
	@Autowired
	private Service1 service1;
	
	@GetMapping("/welcome")
	String welcome() {
		
		service1.handleRequest();
		return "{'msg':'hola'}";
	}

}

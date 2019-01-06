package com.milkyway.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.milkyway.helloworld.configuration.Configurations;

@RestController
public class HelloWorldController {

	@Autowired
	private Configurations configuration;
	@GetMapping("/hello")
	public String getHelloMessage(){
		
		return "Hello "+configuration.getMsg();
	}
}

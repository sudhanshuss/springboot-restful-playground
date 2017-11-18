package com.sid.rest.webservices.springbootrestfulplayground.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sid.rest.webservices.springbootrestfulplayground.pojo.HelloWorldbean;

@RestController
public class HelloWorldController {
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldbean helloWorldBean() {
		return new HelloWorldbean("Hello World");
	}
	

}

package com.bridgelabz.message.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellocontroller")
public class HelloWorldController {
	@RequestMapping(value={"","/","hello"})
	public String sayHello() {
		return "Hello I am sanjay";
	}
}


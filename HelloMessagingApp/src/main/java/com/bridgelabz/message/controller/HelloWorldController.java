package com.bridgelabz.message.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.message.model.User;

@RestController
@RequestMapping("/hellocontroller")
public class HelloWorldController {
	@RequestMapping(value={"","/","hello"})
	public String sayHello() {
		return "Hello I am sanjay";
	}
	
	@RequestMapping(value = {"/query"}, method = RequestMethod.GET)
	public String sayHelloParam(@RequestParam(value = "firstName") String fName, @RequestParam(value = "lastName") String lName) {
		return "Hello" +fName +""+lName;
	}
	
	@GetMapping("/param/{name}")
	public String sayHelloParam(@PathVariable String name) {
		return "Hello" +name+"!";
	}
	
	@PostMapping("/post")
	public String sayHello(@RequestBody User user) {
		return "Hello" +user.getFirstName()+ " " +user.getLastName()+ "!";
	}
}


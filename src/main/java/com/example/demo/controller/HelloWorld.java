package com.example.demo.controller;

import javax.inject.Named;

@Named
@lombok.Getter
@lombok.Setter
public class HelloWorld {

	private String firstName = "John";
	private String lastName = "Doe";
	
	public String showGreeting() {
		return "Hello " + firstName + " " + lastName + "!";
	}
}

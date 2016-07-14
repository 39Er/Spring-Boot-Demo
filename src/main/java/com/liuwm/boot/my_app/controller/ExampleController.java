package com.liuwm.boot.my_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liuwm.boot.my_app.service.ExampleService;

@RestController
public class ExampleController {
	@Autowired
	private ExampleService exampleService;
	
	@RequestMapping("/home")
	public String home() {
		return exampleService.home();
	}
	
}

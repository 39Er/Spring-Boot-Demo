package com.liuwm.boot.my_app.service.impl;

import org.springframework.stereotype.Service;

import com.liuwm.boot.my_app.service.ExampleService;

@Service
public class ExampleServiceImpl implements ExampleService {
	public String home(){
		return "Hello World";
	}
}

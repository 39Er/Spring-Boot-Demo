package com.liuwm.boot.my_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liuwm.boot.my_app.service.UserService;


@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;

	
	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping("/")
	public String home(){
		System.out.println("-----------------------------");
		return "login/loginpage";
		
	}
	
	@RequestMapping("/login")
	public void login(){
		
		
	}
}

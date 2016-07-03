package com.liuwm.boot.my_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liuwm.boot.my_app.model.User;
import com.liuwm.boot.my_app.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping("/find/{id}")
	public String findOne (@PathVariable("id") String id){
		User u = userService.findOne(id);
		return u.toString();
	}
}

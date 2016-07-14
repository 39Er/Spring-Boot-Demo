package com.liuwm.boot.my_app.service;

import com.liuwm.boot.my_app.model.User;

public interface UserService {
	
	public void saveUser(User u);
	public User findOne(String id);
	public User findOne(User u);
	
}

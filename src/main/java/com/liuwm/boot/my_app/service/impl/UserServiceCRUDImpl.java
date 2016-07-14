package com.liuwm.boot.my_app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.liuwm.boot.my_app.dao.UserDaoCRUD;
import com.liuwm.boot.my_app.model.User;
import com.liuwm.boot.my_app.service.UserService;

public class UserServiceCRUDImpl implements UserService{

	@Autowired
	private UserDaoCRUD userDaoCRUD;
	
	@Override
	public void saveUser(User u) {
		userDaoCRUD.save(u);
		
	}

	@Override
	public User findOne(String id) {
		return userDaoCRUD.findOne(id);
	}

	@Override
	public User findOne(User u) {
		return null;
	}
	
	
	
	
}

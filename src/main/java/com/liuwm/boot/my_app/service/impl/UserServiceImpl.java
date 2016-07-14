package com.liuwm.boot.my_app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuwm.boot.my_app.dao.UserDaoCRUD;
import com.liuwm.boot.my_app.dao.UserDao;
import com.liuwm.boot.my_app.model.User;
import com.liuwm.boot.my_app.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	private UserDao userDao;
	

	@Override
	public void saveUser(User u) {
		userDao.save(u);
		
	}


	@Override
	public User findOne(String id) {
		return userDao.findOne(id);
	}


	@Override
	public User findOne(User u) {
		return userDao.findOne(u);
	}
}

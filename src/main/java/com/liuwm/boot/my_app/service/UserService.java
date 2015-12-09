package com.liuwm.boot.my_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuwm.boot.my_app.dao.UserDao;
import com.liuwm.boot.my_app.model.User;
@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	
	public void save(User u ){
		userDao.save(u);
	}
	
	public User findOne(String id){
		return userDao.findOne(id);
	}
}

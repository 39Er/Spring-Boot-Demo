package com.liuwm.boot.my_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuwm.boot.my_app.dao.UserDao;
import com.liuwm.boot.my_app.dao.UserDaoJpa;
import com.liuwm.boot.my_app.model.User;
@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	private UserDaoJpa userDaoJpa;
	
	
	public void save(User u ){
		userDao.save(u);
	}
	
	public User findOne(String id){
		return userDao.findOne(id);
	}
	
	public void saveJpa(User u){
		userDaoJpa.save(u);
	}
}

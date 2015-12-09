package com.liuwm.boot.my_app.dao;

import org.springframework.stereotype.Component;

import com.liuwm.boot.my_app.model.User;


public interface UserDaoJpa{
	
	public void save(User u);
	public User findOne(String id) ;
}

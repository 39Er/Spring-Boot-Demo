package com.liuwm.boot.my_app.dao;

import com.liuwm.boot.my_app.model.User;

public interface UserDao{
	
	public void save(User u);
	public User findOne(String id) ;
	public User findOne(User u);
}

package com.liuwm.boot.my_app.dao;

import com.liuwm.boot.my_app.model.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserDaoCRUD extends CrudRepository<User, String> {

//	User findByUser(User u);
	
}

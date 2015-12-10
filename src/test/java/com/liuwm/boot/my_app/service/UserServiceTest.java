package com.liuwm.boot.my_app.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liuwm.boot.my_app.Application;
import com.liuwm.boot.my_app.dao.UserDao;
import com.liuwm.boot.my_app.dao.UserDaoJpa;
import com.liuwm.boot.my_app.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UserServiceTest {
	private Logger logger = Logger.getLogger(UserServiceTest.class);
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserDaoJpa userDaoJpa;
	@Test
	public void testSave() {
		User u = new User();
		u.setEmail("aa@163.com");
		u.setName("aaa");
		userDao.save(u);
	}
	
	@Test
	public void testFindOne(){
		logger.debug("test mesg" );
		System.out.println(userDao.findOne("8a818088518580da01518580e0b80000").toString());
		//return userDao.findOne((long) 1);
	}
	@Test
	public void testSaveJpa(){
		User u = new User();
		u.setEmail("bb@163.com");
		u.setName("bbb");
		userDaoJpa.save(u);
	}
	
	
	

}

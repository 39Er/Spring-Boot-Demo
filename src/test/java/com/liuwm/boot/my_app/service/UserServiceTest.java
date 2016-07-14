package com.liuwm.boot.my_app.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liuwm.boot.my_app.Application;
import com.liuwm.boot.my_app.dao.UserDaoCRUD;
import com.liuwm.boot.my_app.dao.UserDao;
import com.liuwm.boot.my_app.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UserServiceTest {
	private Logger logger = Logger.getLogger(UserServiceTest.class);
	@Autowired
	private UserDaoCRUD userDaoCRUD;
	@Autowired
	private UserDao userDao;
	@Test
	public void testSave() {
		User u = new User();
		u.setEmail("admin@163.com");
		u.setName("admin");
		u.setPassword("111111");
		u.setTelphone("13522515166");
		userDaoCRUD.save(u);
	}
	
	@Test
	public void testFindOne(){
		logger.debug("test mesg" );
		System.out.println(userDaoCRUD.findOne("297e030c55e1e5160155e1e521aa0000").toString());
		//return userDaoCRUD.findOne((long) 1);
	}
	@Test
	public void testSaveJpa(){
		User u = new User();
		u.setEmail("bb@163.com");
		u.setName("bbb");
		userDao.save(u);
	}
	
	
	

}

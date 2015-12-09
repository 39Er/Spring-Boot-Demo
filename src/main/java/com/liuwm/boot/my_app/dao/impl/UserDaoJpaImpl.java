package com.liuwm.boot.my_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.liuwm.boot.my_app.dao.UserDaoJpa;
import com.liuwm.boot.my_app.model.User;
@Component
public class UserDaoJpaImpl implements UserDaoJpa{
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void save(User u) {
		em.persist(u);
	}

	public User findOne(String id) {
		String jql="select * from User where id = ?";
		Query query = em.createQuery(jql).setParameter(1, id);
		List<User> list = query.getResultList();
		if(null !=list && list.size()==1){
			return list.get(0);
		}
		return null;
	}

}

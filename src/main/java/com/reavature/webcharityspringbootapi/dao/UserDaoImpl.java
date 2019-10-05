package com.reavature.webcharityspringbootapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reavature.webcharityspringbootapi.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	  @Autowired // it can create an obj eg: userdao dao = new userdao;
	    private EntityManager em;
	    
	    public void save(User user) {
	        em.persist(user); //persist,update,delete methods are inbuilt
	    }

	    public List<User> list() {
	        List<User> list = em.createQuery("from User", User.class)
	                .getResultList();
	        return list;
	    }
}

package com.reavature.webcharityspringbootapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reavature.webcharityspringbootapi.dao.UserDao;
import com.reavature.webcharityspringbootapi.model.User;

@Service
public class  UserService{
	 @Autowired
	    private UserDao userDAO;
	    
	    @Transactional
	    public void registerUser(User user) {        
	        userDAO.save(user);
	    }

	    @Transactional
	    public List<User> list() {
	        return userDAO.list();
	    }
}

package com.reavature.webcharityspringbootapi.dao;

import java.util.List;

import com.reavature.webcharityspringbootapi.model.User;

public interface UserDao {
	void save(User user);

    List<User> list();
}

package com.dao.impl;

import org.springframework.stereotype.Component;

import com.dao.UserDao;
import com.entity.User;

@Component("userDao")
public class UserDaoImpl implements UserDao {
	@Override
	public User getUserById(Integer id) {
		
		return null;
	}
	
}

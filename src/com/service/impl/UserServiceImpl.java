package com.service.impl;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.entity.User;
import com.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource(name = "userDao")
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(@Qualifier("userDao") UserDao dao) {
		this.dao = dao;
	}

	@Override
	public User getUserById(Integer id) {
		return null;
	}
}

package com.javachen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javachen.dao.UserDAO;
import com.javachen.entities.UserEntity;
import com.javachen.service.DAOService;

@Component("daoService")
public class DAOServiceImpl implements DAOService {
	
	@Autowired
	private UserDAO userDao;

	@Override
	public UserEntity getUser(int id) {
		return userDao.findById(id);
	}
}

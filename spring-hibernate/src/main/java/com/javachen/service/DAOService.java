package com.javachen.service;

import com.javachen.entities.UserEntity;

public interface DAOService {

	public abstract UserEntity getUser(int id);

}
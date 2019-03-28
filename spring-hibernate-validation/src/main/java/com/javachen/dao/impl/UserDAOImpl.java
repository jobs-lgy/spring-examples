package com.javachen.dao.impl;

import com.javachen.entities.UserEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javachen.dao.GenericDAOImpl;
import com.javachen.dao.UserDAO;

@Repository("userDao")
@Transactional
public class UserDAOImpl extends GenericDAOImpl<UserEntity, Integer> implements UserDAO {

}

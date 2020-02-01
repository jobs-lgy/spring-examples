package com.neo.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.annotation.Resource;

public class SessionFactory {
    
    @Resource
    private SqlSessionFactory test1SqlSessionFactory;
    @Resource
    private SqlSessionFactory test2SqlSessionFactory;
    
    protected SqlSession getTest1Session() {
	return test1SqlSessionFactory.openSession();
    }
    
    protected SqlSession getTest2Session() {
   	return test2SqlSessionFactory.openSession();
       }
       

}


package com.neo.dao.impl;

import com.neo.dao.BaseDao;
import com.neo.dao.UserInformationsDao;
import com.neo.entity.UserInformationsEntity;
import org.springframework.stereotype.Service;

@Service ("userInformationsDao")
public class UserInformationsDaoImpl extends BaseDao implements UserInformationsDao{
    
    @Override
    public void updateUserInformations(UserInformationsEntity userInfo) {
	this.test2Update(userInfo);
    }

}


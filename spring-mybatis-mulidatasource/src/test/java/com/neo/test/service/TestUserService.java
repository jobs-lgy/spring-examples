package com.neo.test.service;

import com.neo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@ContextConfiguration(locations = { "classpath:/test*.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestUserService {
    
        @Resource
	private UserService userService;

	@Test
	public void testUpdateUserinfo() {
	    userService.updateUserinfo();
	    
	}
    

}


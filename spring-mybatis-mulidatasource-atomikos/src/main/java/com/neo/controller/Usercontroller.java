package com.neo.controller;

import com.neo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class Usercontroller {
    @Resource UserService userService;
    
    @RequestMapping("/update")
	public @ResponseBody Object update(){
	     userService.updateUserinfo();
	     return "ok";
	}
    
    
          

}


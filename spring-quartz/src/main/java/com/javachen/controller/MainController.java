package com.javachen.controller;

import com.javachen.domain.User;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javachen.entities.UserEntity;
import com.javachen.service.DAOService;

@Controller
public class MainController {

	@Autowired
	private Mapper mapper;

	@Autowired
	private DAOService service;

	@RequestMapping(value = "/index.html", method = RequestMethod.GET)
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping(value = "/index.html", method = RequestMethod.POST)
	public String postIndex(@RequestParam("firstName") String firstName, ModelMap model) {
		UserEntity entity = service.findUserByFirstName(firstName);
		if (entity != null) {
			model.addAttribute("user", mapper.map(entity, User.class));
		}
		return "user";
	}
}
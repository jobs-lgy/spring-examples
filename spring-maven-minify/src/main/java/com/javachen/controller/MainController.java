package com.javachen.controller;

import java.util.GregorianCalendar;

import com.javachen.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value = "/index.html")
	public String getIndex(ModelMap model) {
		model.addAttribute("user", new User("Gates", "Bill",
				new GregorianCalendar(1955, 9, 28), true));
		return "index";
	}
}
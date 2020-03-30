package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myproject.model.User;
import com.myproject.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginservice;
	
	@RequestMapping("/showlogin")
	public String showlogin(Map<String, Object> map) {
		
		System.out.println(" In controller");
		User use=new User();
		map.put("use1", use);
		System.out.println(" In controller");	
		return "login"; 
	}
	
	@RequestMapping(value = "/submitlogin", method=RequestMethod.POST)
	public String submitlogin(@ModelAttribute("use1") User use) {
		System.out.println(use.getName());
		System.out.println(use.getPassword());
		loginservice.loginservice(use);
		return "login";
	}
}

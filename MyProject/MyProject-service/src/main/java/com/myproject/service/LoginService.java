package com.myproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.model.User;
import com.myproject.repo.LoginRepo;

@Service
public class LoginService {
	@Autowired
	private LoginRepo loginrepo;
	
	public void loginservice(User use) {
		System.out.println(use.getName());
		loginrepo.loginrepo(use);
	}
	

}

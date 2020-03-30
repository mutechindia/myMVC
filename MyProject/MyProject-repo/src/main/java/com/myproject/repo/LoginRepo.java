package com.myproject.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.myproject.model.User;

@Repository
public class LoginRepo {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	public void loginrepo(User use) {
		System.out.println("in repo");
		System.out.println(use.getName());
		System.out.println(use.getPassword());
		hibernateTemplate.save(use);
	}

}

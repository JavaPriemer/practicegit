package com.hcl.gitpractice.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.gitpractice.repositories.CustomerLoginRepository;
import com.hcl.gitpractice.services.CustomerLoginService;

public class CustomerLoginServiceImpl implements CustomerLoginService {

	@Autowired
	CustomerLoginRepository customerLoginRepo;

	@Override
	public boolean validateUser(long id) {
		if (customerLoginRepo.existsById(id))
			return true;
		return false;
	}

}
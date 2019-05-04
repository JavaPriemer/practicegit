package com.hcl.gitpractice.services;

import org.springframework.stereotype.Service;

@Service
public interface CustomerLoginService {

	public boolean validateUser(long id);

}
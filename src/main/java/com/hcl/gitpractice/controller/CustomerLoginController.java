package com.hcl.gitpractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.gitpractice.services.CustomerLoginService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/retailbanking")
public class CustomerLoginController {

	@Autowired
	CustomerLoginService customerLoginService;
	
	@ApiOperation(value = "Validate a user login", response= Boolean.class)
	@ApiResponses(value = {
		@ApiResponse(code=200, message="User logged in successfully."),
		@ApiResponse(code=404, message="The User you were trying to login with doesn't exist")
	})
	@PostMapping(name="/validateUser")
	public boolean isUserLoggedIn(@RequestParam("id") long id) {
		return customerLoginService.validateUser(id);
	}
	
}
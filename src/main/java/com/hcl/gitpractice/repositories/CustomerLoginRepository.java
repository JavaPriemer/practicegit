package com.hcl.gitpractice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hcl.gitpractice.entities.CustomerLoginEntity;

public interface CustomerLoginRepository extends CrudRepository<CustomerLoginEntity, Long> {

}
package com.hcl.gitpractice.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_login")
public class CustomerLoginEntity implements Serializable {

	private static final long serialVersionUID = -4738747542399346298L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String customerName;
	private String customerBalance;
	private Date customerDOB;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerBalance() {
		return customerBalance;
	}

	public void setCustomerBalance(String customerBalance) {
		this.customerBalance = customerBalance;
	}

	public Date getCustomerDOB() {
		return customerDOB;
	}

	public void setCustomerDOB(Date customerDOB) {
		this.customerDOB = customerDOB;
	}

	@Override
	public String toString() {
		return "CustomerLoginEntity [id=" + id + ", customerName=" + customerName + ", customerBalance="
				+ customerBalance + ", customerDOB=" + customerDOB + "]";
	}

}
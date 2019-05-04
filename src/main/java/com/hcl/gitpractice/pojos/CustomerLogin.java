package com.hcl.gitpractice.pojos;

import java.io.Serializable;
import java.util.Date;

public class CustomerLogin implements Serializable {

	private static final long serialVersionUID = 8976044687812004613L;
	
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
		return "CustomerLogin [id=" + id + ", customerName=" + customerName + ", customerBalance=" + customerBalance
				+ ", customerDOB=" + customerDOB + "]";
	}

}
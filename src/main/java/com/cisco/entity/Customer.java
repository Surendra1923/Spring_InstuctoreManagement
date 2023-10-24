package com.cisco.entity;

import org.springframework.lang.NonNull;

import jakarta.persistence.Column;
//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="custid")
	private Long custId;
	
	@Column(name="custname")
	@NonNull
	private String custName;
	
	@Column(name="custemail")
	private String custEmail;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	
	
	
	
	
	

}

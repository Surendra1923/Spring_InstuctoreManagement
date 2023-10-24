package com.cisco.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cisco.entity.Customer;
import com.cisco.exception.CustomerNotFoundException;
@Service
public interface ICustomerService {
	
	
	public Customer insertCustomer(Customer cust);
	
	public List<Customer> getAllCustomer();
	
	public Customer updateCustomer(Long custId, Customer cust) throws CustomerNotFoundException;
	
	public void deleteCustomer(Long custId);
	
	public Customer getCutomer(Long custId);

}

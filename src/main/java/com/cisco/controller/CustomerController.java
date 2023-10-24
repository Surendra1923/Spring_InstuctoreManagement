package com.cisco.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.entity.Customer;
import com.cisco.exception.CustomerNotFoundException;
import com.cisco.service.ICustomerService;

@RestController
public class CustomerController {
	
	
	@Autowired 
	public ICustomerService custservice;
	
	@PostMapping("/insertcustomer")
	public Customer insertCustomer(@RequestBody Customer cust) {
		
		return custservice.insertCustomer(cust);
		
	}
	@GetMapping("getallcustomers")
	public List<Customer> getAllCustomer(){
		return custservice.getAllCustomer();
	}
	@GetMapping("/getcustomer/{custid}")
	public Customer getCutomer(@PathVariable("custid")Long custId) {
		
		return custservice.getCutomer(custId);
		
	}
	
	@DeleteMapping("/deletebyid/{custid}")
	public void deleteCustomer(@PathVariable("custid")Long custId) {
		custservice.deleteCustomer(custId);
	}
	
	@PutMapping("/updatebyid/{custid}")
	public Customer updateCustomer(@PathVariable("custid")Long custId, @RequestBody Customer cust) throws CustomerNotFoundException{
		return custservice.updateCustomer(custId, cust);
		
	}

	

}

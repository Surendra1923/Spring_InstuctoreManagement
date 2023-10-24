package com.cisco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.entity.Customer;
import com.cisco.exception.CustomerNotFoundException;
import com.cisco.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private CustomerRepository custRepo;

	
	public Customer insertCustomer(Customer cust) {
		
		return custRepo.save(cust);
	}


	public List<Customer> getAllCustomer() {
		
		return custRepo.findAll();
	}

	
	public Customer updateCustomer(Long custId, Customer cust) throws CustomerNotFoundException {
		
		Customer existingcust= custRepo.findById(custId).get();
		if(cust!=null) {
			
			existingcust.setCustEmail(cust.getCustEmail());
			existingcust.setCustName(cust.getCustName());
			existingcust.setCustId(cust.getCustId());
			custRepo.save(existingcust);
			
		}
		else {
			throw new CustomerNotFoundException("customer not found");
		}
		
		return existingcust;
	}

	
	public void deleteCustomer(Long custId) {
		// TODO Auto-generated method stub 
		custRepo.deleteById(custId);
		
	}


	public Customer getCutomer(Long custId) {
		
		return custRepo.findById(custId).get();
	}

}

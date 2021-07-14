package com.danny.costomer.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danny.costomer.model.Customer;
import com.danny.costomer.repository.CustomerRepository;

@Service
public class CustomerService {
	
	private CustomerRepository customerRepository;
	
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Transactional
	public void addCustomer(Customer customer) {
		customerRepository.insert(customer);
	}
}

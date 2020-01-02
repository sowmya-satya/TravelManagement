package com.mindtree.travelmanagementcompany.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.travelmanagementcompany.entity.Customer;
import com.mindtree.travelmanagementcompany.repository.CustomerRepository;
import com.mindtree.travelmanagementcompany.repository.PackageRepository;
import com.mindtree.travelmanagementcompany.service.CustomerService;

@Service
public class CustomerImpl implements CustomerService{

	
	@Autowired
	private PackageRepository packageRepo;
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Override
	public boolean verifyDetails(int customerId, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

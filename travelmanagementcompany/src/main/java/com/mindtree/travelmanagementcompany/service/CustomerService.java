package com.mindtree.travelmanagementcompany.service;

import com.mindtree.travelmanagementcompany.entity.Customer;

public interface CustomerService {

	public boolean verifyDetails(int customerId, String password);

	public Customer addCustomer(Customer customer);

}

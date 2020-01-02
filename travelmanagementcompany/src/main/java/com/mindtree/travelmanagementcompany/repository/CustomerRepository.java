package com.mindtree.travelmanagementcompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.travelmanagementcompany.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	

}

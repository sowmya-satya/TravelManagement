package com.mindtree.travelmanagementcompany.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.travelmanagementcompany.entity.Packages;
import com.mindtree.travelmanagementcompany.repository.CustomerRepository;
import com.mindtree.travelmanagementcompany.repository.PackageRepository;
import com.mindtree.travelmanagementcompany.service.PackageService;
@Service
public class PackageImpl implements PackageService {
	
	@Autowired
	private PackageRepository packageRepo;
	
	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public void addPackages(Packages packages) {
		// TODO Auto-generated method stub
		packageRepo.save(packages);
		
	}

	@Override
	public Packages getdetails(int packageId) {
		// TODO Auto-generated method stub
		Packages packageDetails = packageRepo.findById(packageId).get();
		return packageDetails;
	}
	
	

}

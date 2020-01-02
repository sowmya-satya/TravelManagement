package com.mindtree.travelmanagementcompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.travelmanagementcompany.entity.Customer;
import com.mindtree.travelmanagementcompany.entity.Packages;
import com.mindtree.travelmanagementcompany.service.CustomerService;
import com.mindtree.travelmanagementcompany.service.PackageService;

@Controller
public class TravellController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private PackageService packageService;
	
	
	@RequestMapping("/")
	public String registration() {
		return "register";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
		
	}
	@RequestMapping("/welcome")
	public String welcome(@ModelAttribute Customer customer, Model model) {
		Customer customers= customerService.addCustomer(customer);
		model.addAttribute("customers",customers);
		return "Welcome";
	}
	
	
	@RequestMapping("/booking")
	public String booking(@RequestParam int customerId, @RequestParam String password) {
		boolean isFound = false;
		isFound = customerService.verifyDetails(customerId, password);
		if(isFound == true) {
			return "adminpage";
		}
		return "booking";
	}

	@RequestMapping("/addpackages")
	public String insertPackages(Packages packages) {
		packageService.addPackages(packages);
		return "updatepackage";
	}
	
	@RequestMapping("/getDetails")
	public String getDetails(int packageId, Model model) {
		Packages packages = packageService.getdetails(packageId);
		model.addAttribute("packages", packages);
		return "updatepackage";
	}
}

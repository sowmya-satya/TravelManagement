package com.mindtree.travelmanagementcompany.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String customerName;
	private String password;
	private String email;
	private Long phoneNo;
	private String role;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Packages package1;

	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, String password, String email, Long phoneNo, String role,
			Packages package1) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.password = password;
		this.email = email;
		this.phoneNo = phoneNo;
		this.role = role;
		this.package1 = package1;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Packages getPackage1() {
		return package1;
	}

	public void setPackage1(Packages package1) {
		this.package1 = package1;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", password=" + password
				+ ", email=" + email + ", phoneNo=" + phoneNo + ", role=" + role + ", package1=" + package1 + "]";
	}
	
	
	
	
}

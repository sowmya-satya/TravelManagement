package com.mindtree.travelmanagementcompany.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Packages {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int packageId;
	private String packageName;
	private String season;
	private String duration;
	private String cost;
	private boolean food;

	@OneToMany(mappedBy = "package1", cascade = CascadeType.PERSIST)

	private List<Customer> customer;

	public Packages() {
		super();
	}

	public Packages(int packageId, String packageName, String season, String duration, String cost, boolean food,
			List<Customer> customer) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.season = season;
		this.duration = duration;
		this.cost = cost;
		this.food = food;
		this.customer = customer;
	}

	public int getPackageId() {
		return packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public boolean isFood() {
		return food;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Package [packageId=" + packageId + ", packageName=" + packageName + ", season=" + season + ", duration="
				+ duration + ", cost=" + cost + ", food=" + food + ", customer=" + customer + "]";
	}

}

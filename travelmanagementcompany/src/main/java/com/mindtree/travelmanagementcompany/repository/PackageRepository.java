package com.mindtree.travelmanagementcompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.travelmanagementcompany.entity.Packages;


@Repository
public interface PackageRepository extends JpaRepository<Packages, Integer>{

	

}

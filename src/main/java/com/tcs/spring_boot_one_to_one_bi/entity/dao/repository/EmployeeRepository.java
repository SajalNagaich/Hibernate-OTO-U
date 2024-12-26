package com.tcs.spring_boot_one_to_one_bi.entity.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.spring_boot_one_to_one_bi.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}

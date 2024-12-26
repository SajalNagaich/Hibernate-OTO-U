package com.tcs.spring_boot_one_to_one_bi.entity.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcs.spring_boot_one_to_one_bi.entity.Employee;
import com.tcs.spring_boot_one_to_one_bi.entity.dao.repository.EmployeeRepository;

@Repository
public class EmployeeLaptopDao  {
	
	@Autowired
	private EmployeeRepository emRepo;
	
	public Employee saveEmployeedao(Employee emp) {
		return emRepo.saveAndFlush(emp);	
	}
	 public Employee getEmployeeBuIdDao(Integer empId) {
		 Optional<Employee> optional = emRepo.findById(empId);
		 return optional.isPresent()?optional.get():null;
	 }
}

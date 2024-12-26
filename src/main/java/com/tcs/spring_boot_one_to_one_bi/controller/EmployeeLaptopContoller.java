package com.tcs.spring_boot_one_to_one_bi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tcs.spring_boot_one_to_one_bi.entity.Employee;
import com.tcs.spring_boot_one_to_one_bi.entity.dao.EmployeeLaptopDao;

@RestController
@RequestMapping(value = "/employeeLaptopController")
public class EmployeeLaptopContoller {

	@Autowired
	private EmployeeLaptopDao dao;
	
	@PostMapping(value = "/saveemployeeLaptop")
	public Employee saveEmployeeLaptopController(@RequestBody Employee employee) {
		return  dao.saveEmployeedao(employee);
	}
}	
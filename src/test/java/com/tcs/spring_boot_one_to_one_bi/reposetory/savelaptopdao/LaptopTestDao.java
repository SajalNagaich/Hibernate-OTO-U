package com.tcs.spring_boot_one_to_one_bi.reposetory.savelaptopdao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.tcs.spring_boot_one_to_one_bi.entity.Employee;
import com.tcs.spring_boot_one_to_one_bi.entity.Laptop;
import com.tcs.spring_boot_one_to_one_bi.entity.dao.repository.EmployeeRepository;

@ExtendWith(MockitoExtension.class)
public class LaptopTestDao {

	@Mock
	EmployeeRepository employeerepository;
	
	@InjectMocks
	Employee dao;
	
	@Test
	void test() {
		String s1 = "hello";
		String s2 = "Hello";
		assertEquals(s2.equalsIgnoreCase(s1), s1.equalsIgnoreCase(s2));
	}
	
	void testSaveLaptopDao() {
		Employee employee = new Employee(1234, "Sajal", "sajal62mail.com",Laptop);
		
		when(employeerepository.save(employee)).thenReturn(employee);
		
		Employee emp2 = dao.s
	}
}

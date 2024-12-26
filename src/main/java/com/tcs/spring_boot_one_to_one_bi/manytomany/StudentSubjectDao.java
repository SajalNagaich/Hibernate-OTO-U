package com.tcs.spring_boot_one_to_one_bi.manytomany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentSubjectDao {
	
	@Autowired
	private StudentRepository repository;
	
	public List<Student> saveStudentSubjectDao(List<Student> students){
		return repository.saveAll(students);
	}
	

}

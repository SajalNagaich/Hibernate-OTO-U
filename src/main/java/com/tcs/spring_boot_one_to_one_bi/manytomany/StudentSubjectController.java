package com.tcs.spring_boot_one_to_one_bi.manytomany;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class StudentSubjectController {

	private StudentSubjectDao dao;
	
	@PostMapping(value = "/saveAllStudent")
	public List<Student> saveAllStudentController(@RequestBody Student students ){
		return dao.saveStudentSubjectDao(students);
	}
}

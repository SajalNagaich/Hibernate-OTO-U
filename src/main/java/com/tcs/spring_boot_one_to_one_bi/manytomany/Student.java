package com.tcs.spring_boot_one_to_one_bi.manytomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	private int id;
	private String name;
	private int age;
	
	@ManyToMany
	private List<Subject> subjects;

}

package com.tcs.spring_boot_one_to_one_bi.manytomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
	
	private int id;
	private String name;
	private String auther;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Student> student;

}

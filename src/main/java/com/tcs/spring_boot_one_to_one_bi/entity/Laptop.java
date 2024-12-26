package com.tcs.spring_boot_one_to_one_bi.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Laptop {

	@Id
	private int id;
	private String name;
	private String color;
	private double price;
	
	@OneToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
}

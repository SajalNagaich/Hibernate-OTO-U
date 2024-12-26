package com.tcs.spring_boot_one_to_one_bi.dto.onetomany;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

	@Id
	private int id;
	private int quantity;
	
	@OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Product> product;

}

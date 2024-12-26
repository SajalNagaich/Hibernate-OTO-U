package com.tcs.spring_boot_one_to_one_bi.dto.onetomany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

package com.tcs.spring_boot_one_to_one_bi.dto.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartProductDao {

	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private ProductRepository productRepo;

	
	public Cart saveCartProductDao(Cart cart) {
		
		return cartRepository.save(cart);
	}
}

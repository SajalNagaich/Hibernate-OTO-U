package com.tcs.spring_boot_one_to_one_bi.dto.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartProductController {

	@Autowired
	private CartProductDao dao;
	
	@PostMapping(value = "/saveCartProduct")
	public Cart saveCartProductController(@RequestBody Cart cart) {
		return dao.saveCartProductDao(cart);
	}
}   

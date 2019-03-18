package com.bankia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bankia.dao.ProductRepository;
import com.bankia.model.Product;
import com.bankia.service.ProductService;

@RestController
public class ShopController {
	
	@Autowired
	private final ProductRepository repository;

	private final ProductService productService;

	@Autowired
	public ShopController(ProductService productService, ProductRepository repository) {
		this.productService = productService;
		this.repository = repository;
	}

	@RequestMapping(value = "/getDiscount", method = RequestMethod.GET, produces = "application/json")
	public Product getQuestions(@RequestParam(required = true) String tipo) {
		
		List<Product> products = repository.findByCustomerId(tipo);
		
		Product product = new Product();
		product.setTipo(products.get(0).getTipo());

		productService.getProductDiscount(product);

		return product;
	}

}

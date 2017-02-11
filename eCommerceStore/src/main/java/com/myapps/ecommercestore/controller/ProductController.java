package com.myapps.ecommercestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myapps.ecommercestore.domain.repository.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping("/products")
	public String list(Model model){
		
		model.addAttribute("products", productRepository.getAllProducts());
		
		return "products";
	}
	
	@RequestMapping("/products/viewProduct")
	public String viewProducts(Model model){
		
		model.addAttribute("products", productRepository.getAllProducts());
		
		return "viewProduct";
	}

}

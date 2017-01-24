package com.myapps.ecommercestore.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.myapps.ecommercestore.domain.Product;

@Controller
public class ProductController {
	
	@RequestMapping("/products")
	public String list(Model model){
		
		Product book1=new Product("Lit001","Sherlock Holmes",new BigDecimal(500));
		book1.setAuthor("Dan Brown");
		book1.setDescription("Present in this omnibus edition, are four unabridged novels of Baker Streets most famous resident Sherlock Holmes and his confidant and aide, Dr. Watson. The saga of their adventures begin right from the time they are first introduced to each other by a certain young stamford to share rooms in Baker Street, where Watson chronicled their first adventure A Study in Scarlet.");
		book1.setCategory("Literature and Fiction");
		book1.setPublisher("Mcgraw Hills Publications");
		book1.setUnitsInStock(1000);
		
		model.addAttribute("product", book1);
		
		return "products";
		
	}
	

}

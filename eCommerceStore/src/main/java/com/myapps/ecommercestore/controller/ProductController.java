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
		
		Product book1=new Product("Lit001","The Adventures of Sherlock Holmes",new BigDecimal(500));
		book1.setAuthor("Arthur Conan Doyle");
		book1.setDescription("The Adventures of Sherlock Holmes is a collection of twelve short stories by Arthur Conan Doyle, featuring his fictional detective Sherlock Holmes. It was first published on 14 October 1892; the individual stories had been serialised in The Strand Magazine between June 1891 and July 1892.In general the stories in The Adventures of Sherlock Holmes identify, and try to correct, social injustices.");
		book1.setCategory("Literature and Fiction");
		book1.setPublisher("George Newnes");
		book1.setUnitsInStock(100);
		
		model.addAttribute("product", book1);
		
		return "products";
	}
	
	@RequestMapping("/products/viewProduct")
	public String viewProducts(Model model){
		
		Product book1=new Product("Lit001","The Adventures of Sherlock Holmes",new BigDecimal(500));
		book1.setAuthor("Arthur Conan Doyle");
		book1.setDescription("The Adventures of Sherlock Holmes is a collection of twelve short stories by Arthur Conan Doyle, featuring his fictional detective Sherlock Holmes. It was first published on 14 October 1892; the individual stories had been serialised in The Strand Magazine between June 1891 and July 1892.In general the stories in The Adventures of Sherlock Holmes identify, and try to correct, social injustices.");
		book1.setCategory("Literature and Fiction");
		book1.setPublisher("George Newnes");
		book1.setUnitsInStock(100);
		
		model.addAttribute("product", book1);
		
		return "viewProduct";
	}

}

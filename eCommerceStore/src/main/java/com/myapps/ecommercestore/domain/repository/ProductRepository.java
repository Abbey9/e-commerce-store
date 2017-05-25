package com.myapps.ecommercestore.domain.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.myapps.ecommercestore.domain.Product;

public interface ProductRepository {

	List<Product> getAllProducts();
	List<Product> getProductsByCategory(String category);
	Product getProductById(String productId);
	
	//to show products based on filter using matrix variables
	Set<Product> getProductByFilter(Map<String,List<String>> filterParams);
	
	
}

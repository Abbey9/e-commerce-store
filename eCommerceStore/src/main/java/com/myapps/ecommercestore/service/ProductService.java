package com.myapps.ecommercestore.service;

import java.util.List;

import com.myapps.ecommercestore.domain.Product;

public interface ProductService {
	
	List<Product> getAllProducts();
	List<Product> getProductsByCategory(String category);
    Product getProductById(String productId);
    
}

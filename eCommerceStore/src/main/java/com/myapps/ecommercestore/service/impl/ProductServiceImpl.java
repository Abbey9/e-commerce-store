package com.myapps.ecommercestore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapps.ecommercestore.domain.Product;
import com.myapps.ecommercestore.domain.repository.ProductRepository;
import com.myapps.ecommercestore.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		
		return productRepository.getAllProducts() ;
	}

	public Product getProductById(String productID) {
		
		return productRepository.getProductById(productID);
	}

}

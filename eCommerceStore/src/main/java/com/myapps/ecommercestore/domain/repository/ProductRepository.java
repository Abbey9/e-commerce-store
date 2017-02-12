package com.myapps.ecommercestore.domain.repository;

import java.util.List;
import com.myapps.ecommercestore.domain.Product;

public interface ProductRepository {

	List<Product> getAllProducts();
	Product getProductById(String productID);
}

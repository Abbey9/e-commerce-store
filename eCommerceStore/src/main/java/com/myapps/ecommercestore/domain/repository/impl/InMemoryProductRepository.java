package com.myapps.ecommercestore.domain.repository.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.myapps.ecommercestore.domain.Product;
import com.myapps.ecommercestore.domain.repository.ProductRepository;

@Repository
public class InMemoryProductRepository implements ProductRepository {

	private List<Product> listOfProducts = new ArrayList<Product>();

	public InMemoryProductRepository() {

		Product literature = new Product("LIT001", "The Adventures of Sherlock Holmes", new BigDecimal(500));

		literature.setAuthor("Arthur Conan Doyle");
		literature.setDescription(
				"The Adventures of Sherlock Holmes is a collection of twelve short stories by Arthur Conan Doyle, featuring his fictional detective Sherlock Holmes. It was first published on 14 October 1892; the individual stories had been serialised in The Strand Magazine between June 1891 and July 1892.In general the stories in The Adventures of Sherlock Holmes identify, and try to correct, social injustices.");
		literature.setCategory("Literature");
		literature.setPublisher("GeorgeNewnesPublishers");
		literature.setUnitsInStock(1000);

		Product biography = new Product("BIO002", "The Story of My Experiments with Truth", new BigDecimal(700));

		biography.setAuthor("Mohandas Karamchand Ghandi");
		biography.setDescription(
				"There is a reason as to why there can never be another Mahatma Gandhi.The Story of My Experiments with Truth is the compelling autobiography of Mohandas Karamchand Gandhi, who in his quest for freedom of his country, inspired millions with the strength of his willpower and personal actions. His immovable belief in truth and non-violence even in the most difficult situations made him a true hero.");
		biography.setCategory("Biographies");
		biography.setPublisher("UniversitiesPressPublishers");
		biography.setUnitsInStock(999);

		Product romance = new Product("ROM003", "The NoteBook", new BigDecimal(400));

		romance.setAuthor("Nicholas Sparks");
		romance.setDescription(
				"The Notebook is internationally bestselling love story: The love story to end all love stories.Somewhere, muses Noah Calhoun, while sitting on his porch in the moonight, 'there were people making love'. The Notebook, a Southern-fried story of love-lost-and-found-again, revolves around a single time-honored romantic dilemma: will beautiful Allison Nelson stay with Mr. Respectability (to whom she happens to be engaged), or will she choose Noah, the romantic rascal she left so many years ago? ");
		romance.setCategory("Romance");
		romance.setPublisher("LittleBrownBookPublishers");
		romance.setUnitsInStock(300);
		
		Product bestsellers = new Product("BEST006", "How to Win Friends and Influence People", new BigDecimal(339));

		bestsellers.setAuthor("Dale Carnegie");
		bestsellers.setDescription("How to win friends and influence people: is a self-help book which is the pioneer of this genre. Written by Dale Carnegie and published in 1936, it has sold over 30 million copies.This book is a guide in improving a person's aura in the world. As long as you have good friends and good business associations, you will probably stay strong in personal as well as professional life. This is one of the most influential business and communication skills guide.");
		bestsellers.setCategory("BestSellers");
		bestsellers.setPublisher("RHUKPublishers");
		bestsellers.setUnitsInStock(99);


		listOfProducts.add(literature);
		listOfProducts.add(biography);
		listOfProducts.add(romance);
		listOfProducts.add(bestsellers);
		
	}

	public List<Product> getAllProducts() {

		return listOfProducts;
	}

	public Product getProductById(String productId) {
		
		Product productById = null;

		for (Product product : listOfProducts) {
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}

		if (productById == null) {
			throw new IllegalArgumentException("No products found with the productId:" + productId);
		}

		return productById;
	}

	public List<Product> getProductsByCategory(String category) {
		
		List<Product> productsByCategory = new ArrayList<Product>();

		for (Product product : listOfProducts) {
			if (category.equalsIgnoreCase(product.getCategory())) {
				productsByCategory.add(product);
			}
		}
		return productsByCategory;
	}

	@Override
	public Set<Product> getProductByFilter(Map<String, List<String>> filterParams) {
		
		Set<Product> productsByBrand=new HashSet<Product>();
		Set<Product> productsByCategory=new HashSet<Product>();
		
		Set<String> criterias=filterParams.keySet();
		
		if(criterias.contains("brand")){
			for(String brandName:filterParams.get("brand")){
				for(Product product:listOfProducts){
					if(brandName.equalsIgnoreCase(product.getPublisher())){
						productsByBrand.add(product);
					}
				}
			}
		}
		
		if(criterias.contains("category")){
			for(String category:filterParams.get("category")){
				productsByCategory.addAll(this.getProductsByCategory(category));
			}
		}
		
		productsByCategory.retainAll(productsByBrand);
		
		return productsByCategory;
	}
}

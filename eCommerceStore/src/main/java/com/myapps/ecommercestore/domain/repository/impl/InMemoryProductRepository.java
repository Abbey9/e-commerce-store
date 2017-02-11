package com.myapps.ecommercestore.domain.repository.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.myapps.ecommercestore.domain.Product;
import com.myapps.ecommercestore.domain.repository.ProductRepository;

@Repository
public class InMemoryProductRepository implements ProductRepository{
   
	private List<Product> listOfProducts=new ArrayList<Product> ();
	
	public InMemoryProductRepository(){
		
	Product lit=new Product("Lit001","The Adventures of Sherlock Holmes",new BigDecimal(500));
	
    lit.setAuthor("Arthur Conan Doyle");
    lit.setDescription("The Adventures of Sherlock Holmes is a collection of twelve short stories by Arthur Conan Doyle, featuring his fictional detective Sherlock Holmes. It was first published on 14 October 1892; the individual stories had been serialised in The Strand Magazine between June 1891 and July 1892.In general the stories in The Adventures of Sherlock Holmes identify, and try to correct, social injustices.");
	lit.setCategory("Literature and Fiction");
	lit.setPublisher("George Newnes");
	lit.setUnitsInStock(100);
	
	Product bio=new Product("Bio002","The Story of My Experiments with Truth",new BigDecimal(700));
	
    bio.setAuthor("Mohandas Karamchand Ghandi");
    bio.setDescription("There is a reason as to why there can never be another Mahatma Gandhi.'The Story of My Experiments with Truth’ is the compelling autobiography of Mohandas Karamchand Gandhi, who in his quest for freedom of his country, inspired millions with the strength of his willpower and personal actions. His immovable belief in truth and non-violence even in the most difficult situations made him a true hero.");
    bio.setCategory("Biographies");
    bio.setPublisher("Universities Press");
    bio.setUnitsInStock(100);
    
    
    Product rom=new Product("Rom003","The NoteBook", new BigDecimal(400));
    
    rom.setAuthor("Nicholas Sparks");
    rom.setDescription("The Notebook is internationally bestselling love story: The love story to end all love stories.Somewhere, muses Noah Calhoun, while sitting on his porch in the moonight, 'there were people making love'. The Notebook, a Southern-fried story of love-lost-and-found-again, revolves around a single time-honored romantic dilemma: will beautiful Allison Nelson stay with Mr. Respectability (to whom she happens to be engaged), or will she choose Noah, the romantic rascal she left so many years ago? ");
    rom.setCategory("Romance");
    rom.setPublisher("Little, Brown Book Group");
    bio.setUnitsInStock(100);
    
    listOfProducts.add(lit);
    listOfProducts.add(bio);
    listOfProducts.add(rom);
	}
	
	public List<Product> getAllProducts() {
		
		return listOfProducts;
	}
	

}

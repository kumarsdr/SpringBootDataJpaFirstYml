package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.product.Product;
import com.app.repo.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner{
	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
		Product p=repo.save(new Product("HAIER-170",10.3));
		System.out.println(p.getProdId());
		repo.save(new Product("LG-190",14.2));
		repo.save(new Product("SAMSUNG-192",13.6));
		
	}

}

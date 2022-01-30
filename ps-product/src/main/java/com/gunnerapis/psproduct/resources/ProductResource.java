package com.gunnerapis.psproduct.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gunnerapis.psproduct.entities.Product;
import com.gunnerapis.psproduct.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> product = productRepository.findAll();
		return ResponseEntity.ok(product);

	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product product = productRepository.findById(id).get();
		return ResponseEntity.ok(product);
	}

}

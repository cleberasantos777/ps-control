package com.gunnerapis.psproduct.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gunnerapis.psproduct.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
	

}

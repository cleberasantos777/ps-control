package com.gunnerapis.psstock.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gunnerapis.psstock.entities.Product;

@Component
@FeignClient(name = "ps-product", path = "/products")
public interface StockFeignClient {
	
	@GetMapping(value = "/{id}")
	ResponseEntity<Product> findById(@PathVariable Long id);

}

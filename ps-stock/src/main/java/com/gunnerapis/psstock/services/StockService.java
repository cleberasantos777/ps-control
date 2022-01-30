package com.gunnerapis.psstock.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gunnerapis.psstock.entities.Product;
import com.gunnerapis.psstock.entities.Stock;
import com.gunnerapis.psstock.feignclients.StockFeignClient;

@Service
public class StockService {

	@Autowired
	private StockFeignClient stockFeignClient;

	public Stock getStock(long stockId, int qtde) {

		Product product = stockFeignClient.findById(stockId).getBody();
		return new Stock(product.getName(), product.getMark(), product.getPrice(), qtde);

	}

}

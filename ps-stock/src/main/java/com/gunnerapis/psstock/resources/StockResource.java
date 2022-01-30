package com.gunnerapis.psstock.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gunnerapis.psstock.entities.Stock;
import com.gunnerapis.psstock.services.StockService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(value = "/stocks")
public class StockResource {

	@Autowired
	private StockService stockService;

	@HystrixCommand(fallbackMethod = "getStockAlternative")
	@GetMapping(value = "/{productId}/qtde/{qtde}")
	public ResponseEntity<Stock> getStock(@PathVariable Long productId, @PathVariable Integer qtde) {
		Stock stock = stockService.getStock(productId, qtde);
		return ResponseEntity.ok(stock);
	}

	public ResponseEntity<Stock> getStockAlternative(Long productId, Integer qtde) {
		Stock stock = new Stock("defaultProduct", "defaultMark", 777.00, qtde);
		return ResponseEntity.ok(stock);
	}

}

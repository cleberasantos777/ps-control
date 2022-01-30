package com.gunnerapis.psstock.entities;

import java.io.Serializable;
import java.util.Objects;

public class Stock implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String mark;
	private Double price;
	private Integer amount;
	
	public Stock() {
		
	}
	
	public Stock(String name, String mark, Double price, Integer amount) {
		super();
		this.name = name;
		this.mark = mark;
		this.price = price;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, mark, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		return Objects.equals(amount, other.amount) && Objects.equals(mark, other.mark)
				&& Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}		

}

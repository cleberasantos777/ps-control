package com.gunnerapis.psstock.entities;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String mark;
	private Double price;

	public Product() {
	}
	
	public Product(Long id, String name, String mark, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public int hashCode() {
		return Objects.hash(id, mark, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id) && Objects.equals(mark, other.mark) && Objects.equals(name, other.name)
				&& Objects.equals(price, other.price);
	}	

}

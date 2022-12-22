package com.ventas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Food {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_food;
	private String name;
	private Double price;
	
	public Food(Long id, String name, Double price) {
		super();
		this.id_food = id;
		this.name = name;
		this.price = price;
	}

	public Food(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Food() {
		super();
	}

	public Long getId() {
		return id_food;
	}

	public void setId(Long id) {
		this.id_food = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}

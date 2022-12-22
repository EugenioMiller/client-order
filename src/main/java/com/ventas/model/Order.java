package com.ventas.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Long id;
	@OneToOne
	@JoinColumn(name="id_client")
	private Client client;
	@ManyToMany
	private List<Food> foods;
	
	public Order(Long id, Client client, List<Food> foods) {
		super();
		this.id = id;
		this.client = client;
		this.foods = foods;
	}

	public Order(Client client, List<Food> foods) {
		super();
		this.client = client;
		this.foods = foods;
	}

	public Order() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}
	
	
}

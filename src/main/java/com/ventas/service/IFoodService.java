package com.ventas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ventas.model.Food;

@Service
public interface IFoodService {

	public Food create (Food c);
	
	public List<Food> getAll();
	
	public void delete (Food c);
	
	public Optional<Food> getById (Long id);
}

package com.ventas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventas.model.Food;
import com.ventas.repository.IFoodRepository;

@Service
public class FoodService implements IFoodService{

	@Autowired
	private IFoodRepository foodRepo;
	
	@Override
	public Food create(Food f) {
		return foodRepo.save(f);
	}

	@Override
	public List<Food> getAll() {
		List<Food> aux = foodRepo.findAll();
		return aux;
	}

	@Override
	public void delete(Food f) {
		foodRepo.delete(f);
	}

	@Override
	public Optional<Food> getById(Long id) {
		return foodRepo.findById(id);
	}

	
}

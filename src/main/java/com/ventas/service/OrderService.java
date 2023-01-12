package com.ventas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventas.model.Order;
import com.ventas.repository.IOrderRepository;

@Service
public class OrderService implements IOrderService{

	@Autowired
	private IOrderRepository orderRepo;
	
	@Override
	public Order create(Order o) {
		return orderRepo.save(o);
	}

	@Override
	public List<Order> getAll() {
		List<Order> orders = orderRepo.findAll();
		
		return orders;
	}

	@Override
	public void delete(Order o) {
		orderRepo.delete(o);
	}

	@Override
	public Optional<Order> getById(Long id) {
		return orderRepo.findById(id);
	}

}

package com.ventas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ventas.model.Order;

@Service
public interface IOrderService {

	public Order create (Order o);
	
	public List<Order> getAll();
	
	public void delete (Order o);
	
	public Optional<Order> getById (Long id);
}

package com.ventas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ventas.model.Client;

@Service
public interface IClientService {

	public Client create (Client c);
	
	public List<Client> getAll();
	
	public void delete (Client c);
	
	public Optional<Client> getById (Long id);
}

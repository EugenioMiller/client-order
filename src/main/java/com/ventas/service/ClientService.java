package com.ventas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventas.model.Client;
import com.ventas.repository.ClientRepository;


@Service
public class ClientService implements IClientService{

	@Autowired
	private ClientRepository clientRepo;

	@Override
	public Client create(Client c) {
		return clientRepo.save(c);
	}

	@Override
	public List<Client> getAll() {
		List<Client> clients = clientRepo.findAll();
		
		return clients;
	}

	@Override
	public void delete(Client c) {
		clientRepo.delete(c);
	}

	@Override
	public Optional<Client> getById(Long id) {
		return clientRepo.findById(id);
	}
	
	
}

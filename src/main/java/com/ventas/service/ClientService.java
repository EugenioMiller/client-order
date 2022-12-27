package com.ventas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ventas.repository.ClientRepository;

import ch.qos.logback.core.net.server.Client;

@Service
public class ClientService {

	private ClientRepository clientRepo;
	
	public Client create(Client c) {
		return clientRepo.save(c);
	}
	
	public List<Client> getClients(){
		return clientRepo.findAll();
	}
	
	public void delete (Client c) {
		clientRepo.delete(c);
	}
	
	public Optional<Client> getById(Long id){
		return clientRepo.findById(id);
	}
}

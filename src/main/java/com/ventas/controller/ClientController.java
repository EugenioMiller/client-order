package com.ventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ventas.model.Client;
import com.ventas.service.IClientService;


@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private IClientService clientSer;
	
	@PostMapping
	public String create(@RequestBody Client client) {
		clientSer.create(client);
		return client == null ? "error_page" : "redirect:/";
	} 
	
	@GetMapping
	public List<Client> getClients(){
		return clientSer.getAll();
	}
}

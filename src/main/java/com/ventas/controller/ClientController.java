package com.ventas.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ventas.service.ClientService;

import ch.qos.logback.core.net.server.Client;

@RestController
@RequestMapping("/client")
public class ClientController {

	private ClientService cleintSer;
	
	@PostMapping
	public Client create(@RequestBody Client c) {
		return cleintSer.create(c);
	} 
	
}

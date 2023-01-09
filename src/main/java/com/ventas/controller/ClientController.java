package com.ventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ventas.model.Client;
import com.ventas.service.IClientService;


@Controller
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private IClientService clientSer;

	@PostMapping
	public String create(@ModelAttribute Client client) {
		clientSer.create(client);
		return client == null ? "error_page" : "redirect:/";
	} 
	
	@GetMapping
	public List<Client> getClients(){
		return clientSer.getAll();
	}
}

package com.ventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ventas.model.Client;
import com.ventas.model.Food;
import com.ventas.model.Order;
import com.ventas.service.IClientService;
import com.ventas.service.IFoodService;

@Controller
public class ViewController {
	
	@Autowired
	private IClientService clientSer;
	@Autowired
	private IFoodService foodSer;
	
	@RequestMapping("/newClient")
	public String getFormClient () {
		return "formClient";
	}
	
	@RequestMapping("/newFood")
	public String getFormFood () {
		return "formFood";
	}
	
	@GetMapping("/newOrder")
	public String getFormIrder (Model model) {
		
		List<Client> clients = clientSer.getAll();
		List<Food> foods = foodSer.getAll();
		
		model.addAttribute("order", new Order());
		model.addAttribute("clients", clients);
		model.addAttribute("foods", foods);
		
		return "formOrder";
	}
}

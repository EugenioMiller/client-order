package com.ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ventas.model.Order;
import com.ventas.service.IOrderService;

@Controller
public class OrderController {

	@Autowired
	private IOrderService orderServ;
	
	@PostMapping("/createOrder")
	public String generateOrder(@ModelAttribute Order o) {
		try {
			orderServ.create(o);
			return "redirect:/";
		} catch (Exception e) {
			return "error_page";
		}
	}
	
}

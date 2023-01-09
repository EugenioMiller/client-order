package com.ventas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	
	@RequestMapping("/newClient")
	public String getFormClient () {
		return "formClient";
	}
	
	@RequestMapping("/newFood")
	public String getFormFood () {
		return "formFood";
	}
	
	@RequestMapping("/newOrder")
	public String getFormIrder () {
		return "formOrder";
	}
}

package com.ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ventas.model.Food;
import com.ventas.service.IFoodService;


@Controller
public class FoodController {

	@Autowired
	private IFoodService foodServ;
	
	@PostMapping("/createFood")
	public String createFood(@ModelAttribute Food f) {
		try {
			foodServ.create(f);
			return "redirect:/";
		} catch (Exception e) {
			return "error_page";
		}
		
	}
}

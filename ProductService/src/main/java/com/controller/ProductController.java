package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	public Environment environment;
	

	@GetMapping("/getProduct/{id}")
	public String getProduct(@PathVariable("id")int id) {
		String response	= environment.getProperty("local.server.port");
		
		return  "Product id :"+id +"Prouct name : Laptop  running on port : " + response;
		
	}
	
	
	@GetMapping("/getController")
	public String getController() {

		return "I am product controller!!";
	}
}

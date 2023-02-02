package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.vo.Datasource;

@Controller
public class Is296DemoController {
	private Datasource ds;
	
	public Is296DemoController(Datasource ds) {
		System.out.println("Controller instantiated");
		this.ds = ds;
	}
	
	@GetMapping("/homebase") 
	public String getHomePage() {
		return "home";
	}
	

}

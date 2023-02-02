package com.example.model;

import org.springframework.stereotype.Component;

import com.example.controller.Is296DemoController;

@Component
public class Datasource2 {
	
	private Is296DemoController is296;
	
	public Datasource2(Is296DemoController is296) {
		System.out.println("Datasource 2 is instantiated");
		this.is296 = is296;
	}
}

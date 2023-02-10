package com.example.model;

import org.springframework.stereotype.Component;

import com.example.controller.Is296DemoController;
import com.example.controller.Is296DemoControllerJavaConfig;

public class Datasource2JavaConfig {
	
	private Is296DemoControllerJavaConfig is296;
	
	public Datasource2JavaConfig(Is296DemoControllerJavaConfig is296) {
		System.out.println("Datasource2JavaConfig is instantiated");
		this.is296 = is296;
	}
}

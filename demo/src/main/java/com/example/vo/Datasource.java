package com.example.vo;

import org.springframework.stereotype.Component;

@Component
public class Datasource {
	public String userName;
	
	public Datasource() {
		System.out.println("Datasource instantiated");
	}
	
	public void setUsername(String userName) {
		this.userName = userName;
	}

}

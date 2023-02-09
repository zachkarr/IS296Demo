package com.example.vo;

import org.springframework.stereotype.Component;

public class DatasourceJavaConfig {
	public String userName;
	
	public DatasourceJavaConfig() {
		System.out.println("DatasourceJavaConfig instantiated");
	}
	
	public void setUsername(String userName) {
		this.userName = userName;
	}

}

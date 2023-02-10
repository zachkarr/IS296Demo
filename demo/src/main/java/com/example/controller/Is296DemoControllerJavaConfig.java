package com.example.controller;

<<<<<<< HEAD
import com.example.vo.Datasource;
import com.example.vo.DatasourceJavaConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class Is296DemoControllerJavaConfig {
	private DatasourceJavaConfig ds;

=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.vo.Datasource;
import com.example.vo.DatasourceJavaConfig;

public class Is296DemoControllerJavaConfig {
	private DatasourceJavaConfig ds;
	
>>>>>>> 36eb03b6b40add2d117b3bfbbfce8a42f8e2d0fd
	public Is296DemoControllerJavaConfig(DatasourceJavaConfig ds) {
		System.out.println("Is296DemoControllerJavaConfig instantiated");
		this.ds = ds;
	}
	
	@GetMapping("/homebase") 
	public String getHomePage() {
		return "home";
	}
	

}

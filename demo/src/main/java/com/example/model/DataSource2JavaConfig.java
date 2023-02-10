package com.example.model;

import com.example.controller.Is296DemoController;
import com.example.controller.Is296DemoControllerJavaConfig;
import org.springframework.stereotype.Component;


public class DataSource2JavaConfig {

	private Is296DemoControllerJavaConfig is296;

	public DataSource2JavaConfig(Is296DemoControllerJavaConfig is296) {
		System.out.println("DatasourceJavaConfig 2 is instantiated");
		this.is296 = is296;
	}
}

package com.example.vo;

import org.springframework.stereotype.Component;

<<<<<<< HEAD

public class DatasourceJavaConfig {
	public String userName;

=======
public class DatasourceJavaConfig {
	public String userName;
	
>>>>>>> 36eb03b6b40add2d117b3bfbbfce8a42f8e2d0fd
	public DatasourceJavaConfig() {
		System.out.println("DatasourceJavaConfig instantiated");
	}
	
	public void setUsername(String userName) {
		this.userName = userName;
	}

}

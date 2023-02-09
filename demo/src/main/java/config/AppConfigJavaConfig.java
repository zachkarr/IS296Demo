package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.example.controller.Is296DemoControllerJavaConfig;
import com.example.model.Datasource2JavaConfig;
import com.example.vo.DatasourceJavaConfig;

public class AppConfigJavaConfig {
		
	@Bean public DatasourceJavaConfig getDataSource() {
		return new DatasourceJavaConfig();
	}
	@Bean public Datasource2JavaConfig getDataSource2JavaConfig() {
		return new Datasource2JavaConfig(getIs296DemoControllerJavaConfig(getDataSource()));
	}
	@Bean public Is296DemoControllerJavaConfig getIs296DemoControllerJavaConfig(DatasourceJavaConfig ds) {
		return new Is296DemoControllerJavaConfig(ds);
	}

}

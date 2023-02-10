<<<<<<< HEAD
package config;

import com.example.controller.Is296DemoControllerJavaConfig;
import com.example.model.DataSource2JavaConfig;
import com.example.vo.DatasourceJavaConfig;
import org.springframework.context.annotation.Bean;

public class AppConfigJavaConfig {

    @Bean public DatasourceJavaConfig getDataSource() {
        return new DatasourceJavaConfig();
 }
    @Bean public DataSource2JavaConfig getDataSource2JavaConfig() {
        return new DataSource2JavaConfig(getIs296DemoControllerJavaConfig(getDataSource()));
    }
    @Bean public Is296DemoControllerJavaConfig getIs296DemoControllerJavaConfig(DatasourceJavaConfig ds) {

        return new Is296DemoControllerJavaConfig(ds);
    }

}
=======
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
>>>>>>> 36eb03b6b40add2d117b3bfbbfce8a42f8e2d0fd

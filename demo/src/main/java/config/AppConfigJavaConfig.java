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

package config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
<<<<<<< HEAD
@ComponentScan({"com.example"})
=======
@ComponentScan("com.example")
>>>>>>> 36eb03b6b40add2d117b3bfbbfce8a42f8e2d0fd
@Import({AppConfigJavaConfig.class})
public class AppConfig {

	
}

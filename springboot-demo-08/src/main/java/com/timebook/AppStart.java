package com.timebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type App start.
 *
 * @author xiongzl
 */
@SpringBootApplication
public class AppStart {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		//new SpringApplicationBuilder(AppStart.class).properties("spring.config.location=classpath:/application-dev.properties").run();
		SpringApplication.run(AppStart.class, args);
	}

}

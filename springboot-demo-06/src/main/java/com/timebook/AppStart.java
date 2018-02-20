package com.timebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * The type App start.
 *
 * @title: AppStart
 * @author: xiongzl
 * @date: 2018 /2/20
 */
@SpringBootApplication
@EnableScheduling
public class AppStart {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(AppStart.class, args);
	}

}

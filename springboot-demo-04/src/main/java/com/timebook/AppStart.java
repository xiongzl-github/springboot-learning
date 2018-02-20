package com.timebook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * The type App start.
 * @title: AppStart
 * @author: xiongzl
 * @date: 2018 /2/20
 * @descprition: springboot 启动类
 * @mapperScan: mapper类的路径
 */
@SpringBootApplication
@MapperScan("com.timebook.mapper")
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

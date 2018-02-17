package com.timebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @title: Main
 * @author: xiongzl
 * @date: 2018/2/17
 * @descprition: springboot启动类
 * @SpringBootApplication: 这个注解表示这是一个spring boot应用程序
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

package com.timebook.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * The type User.
 *
 * @author xiongzl
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "user")
public class User {

    private String name;

    private int age;

    private int sex;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

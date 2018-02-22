package com.timebook.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * The type Data base info.
 *
 * @author xiongzl
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "db")
@PropertySource("classpath:db.properties")
public class DataBaseInfo {

    private String name;

    private String password;

    /**
     * Instantiates a new Data base info.
     *
     * @param name     the name
     * @param password the password
     */
    public DataBaseInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }

    /**
     * Instantiates a new Data base info.
     */
    public DataBaseInfo() {
    }

    @Override
    public String toString() {
        return "DataBaseInfo{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

package com.timebook.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * The type Message.
 *
 * @author xiongzl
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "com.timebook")
public class Message {
    private String msg;

}

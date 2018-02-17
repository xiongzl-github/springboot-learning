package com.timebook.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @title: User
 * @author: xiongzl
 * @date: 2018/2/17
 * @descprition: User对象
 */
@Data
public class User {

    private long id;

    private String username;

    private int age;

    private int sex;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public User(long id, String username, int age, int sex, Date createTime) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.sex = sex;
        this.createTime = createTime;
    }

    public User() {
    }
}

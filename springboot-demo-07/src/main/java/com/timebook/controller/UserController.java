package com.timebook.controller;

import com.timebook.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type User controller.
 *
 * @author xiongzl
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private User user;

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private int age;

    @Value("${user.sex}")
    private int sex;

    /**
     * Gets user.
     *
     * @return the user
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getUser() {
        return user.toString();
    }

    /**
     * Query user object.
     *
     * @return the object
     */
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public Object queryUser() {
        return "name: " + name + ", sex: " + sex + ", age: " + age +".";
    }







}

package com.timebook.controller;

import com.timebook.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @title: UserController
 * @author: xiongzl
 * @date: 2018/2/17
 * @descprition: user控制器
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @RequestMapping("/getUser")
    public User getUser() {
        User user = new User(1, "xiongzl", 26, 1, new Date());
        return user;
    }

    /**
     * springboot 默认使用的是Jackson来转换对象
     * {
     *   id: 1,
     *   username: "xiongzl",
     *   age: 26,
     *   sex: 1,
     *   createTime: 1518860562124
     *  }
     */

    /**
     * springboot 配置了fastJson之后, 可以对日期格式进行指定
     * {
     *    age: 26,
     *    createTime: "2018-02-17 20:17:16",
     *    id: 1,
     *    sex: 1,
     *    username: "xiongzl"
     *  }
     */



}

package com.timebook.service;

import com.timebook.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * The interface User service.
 *
 * @title: UserService
 * @author: xiongzl
 * @date: 2018 /2/20
 * @descprition: 用户服务类
 */
public interface UserService {


    /**
     * 添加用户
     *
     * @param user the user
     * @return int int
     * @author xiongzl
     * @date 2018 /2/20
     */
    int addUser(User user);

    /**
     * 查询所有的用户
     *
     * @param pageModel the page model
     * @return Object object
     * @author xiongzl
     * @date 2018 /2/20
     */
    Object queryAllUsers(Map<String, Object> pageModel);
}

package com.timebook.service.impl;

import com.github.pagehelper.PageHelper;
import com.timebook.mapper.UserMapper;
import com.timebook.model.User;
import com.timebook.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * The type User service.
 *
 * @title: UserServiceImpl
 * @author: xiongzl
 * @date: 2018 /2/20
 * @descprition: 用户服务实现类
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;


    /**
      * 添加用户
      * @param user
      * @author xiongzl
      * @date 2018/2/20
      * @return
    */
    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

    /**
     * 查询所有的用户
     * @param pageModel
     * @return Object
     * @author xiongzl
     * @date 2018/2/20
     */
    @Override
    public List<User> queryAllUsers(Map<String, Object> pageModel) {
        PageHelper.startPage(Integer.parseInt(pageModel.get("pageNum").toString()), Integer.parseInt(pageModel.get("pageSize").toString()));
        return userMapper.queryAllUsers();
    }
}

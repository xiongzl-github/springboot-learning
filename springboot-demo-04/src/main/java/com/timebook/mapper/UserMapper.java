package com.timebook.mapper;

import com.timebook.model.User;

import java.util.List;

/**
 * The interface User mapper.
 *
 * @title: UserMapper
 * @author: xiongzl
 * @date: 2018 /2/20
 * @descprition: user 映射类
 */
public interface UserMapper {
    /**
     * 根据用户id删除用户
     *
     * @param id the id
     * @return int int
     * @author xiongzl
     * @date 2018 /2/20
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加一个用户
     *
     * @param record the record
     * @return int int
     * @author xiongzl
     * @date 2018 /2/20
     */
    int insert(User record);

    /**
     * 添加一个用户
     *
     * @param record the record
     * @return int int
     * @author xiongzl
     * @date 2018 /2/20
     */
    int insertSelective(User record);

    /**
     * 根据用户id查找用户
     *
     * @param id the id
     * @return user user
     * @author xiongzl
     * @date 2018 /2/20
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 更新用户
     *
     * @param record the record
     * @return int int
     * @author xiongzl
     * @date 2018 /2/20
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 根据id更新用户
     *
     * @param record the record
     * @return int int
     * @author xiongzl
     * @date 2018 /2/20
     */
    int updateByPrimaryKey(User record);

    /**
     * 查询所有的用户
     *
     * @return list
     * @author xiongzl
     * @date 2018 /2/20
     */
    List<User> queryAllUsers();
}
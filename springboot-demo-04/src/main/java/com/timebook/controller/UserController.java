package com.timebook.controller;

import com.timebook.model.User;
import com.timebook.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * The type User controller.
 *
 * @title: UserController
 * @author: xiongzl
 * @date: 2018 /2/20
 * @descprition: user控制器
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private UserService userService;

    private static final int SUCCESS = 1;

    private static final int FAILED = 0;

    /**
     * 添加用户
     *
     * @param user the user
     * @return int int
     * @author xiongzl
     * @date 2018 /2/20
     */
    @ResponseBody
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public int addUser(@RequestBody User user) {
        if(null == user) {
            return 0;
        }
        return userService.addUser(user);
    }

    /**
     * Query all users object.
     *
     * @param pageModel the page model
     * @return the object
     */
    @ResponseBody
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public Object queryAllUsers(@RequestBody Map<String, Object> pageModel) {
        Object result = checkQueryAllUsersMethodParams(pageModel);
        if (null != result) {
            return result;
        }
        return userService.queryAllUsers(pageModel);
    }

    /**
      * 检查queryAllUsers方法参数
      * @param pageModel
      * @author xiongzl
      * @date 2018/2/20
      * @return Object
    */
    private Object checkQueryAllUsersMethodParams(Map<String, Object> pageModel) {
        Object pageSize;
        Object pageNum;
        if (null != pageModel) {
            pageSize = pageModel.get("pageSize");
            pageNum = pageModel.get("pageNum");
            if (null == pageSize) {
                return UserController.FAILED;
            } else if (null == pageNum) {
                return UserController.FAILED;
            } else {
                return null;
            }
        } else {
            return UserController.FAILED;
        }

//        if (null == pageModel) {
//            return UserController.FAILED;
//        } else if (null == pageSize) {
//            return UserController.FAILED;
//        } else if (null == pageNum) {
//            return UserController.FAILED;
//        } else {
//            return null;
//        }
    }


}

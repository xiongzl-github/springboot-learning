package com.timebook.controller;

import com.timebook.constant.exception.Constant;
import com.timebook.exception.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Exception test.
 *
 * @title: ExceptionTest
 * @author: xiongzl
 * @date: 2018 /2/20
 * @descprition: 测试异常
 */
@RestController
@RequestMapping("/api/exception")
public class ExceptionTest {


    /**
     * Test exception string.
     *
     * @return the string
     * @throws MyException the my exception
     */
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String testException() throws MyException {
        throw new MyException(Constant.EXCEPTION_USER_CODE_01, Constant.EXCEPTION_USER_MSG_01);
    }



}

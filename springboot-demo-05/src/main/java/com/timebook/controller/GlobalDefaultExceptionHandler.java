package com.timebook.controller;

import com.timebook.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Global default exception handler.
 *
 * @title: GlobalDefaultExceptionHandler
 * @author: xiongzl
 * @date: 2018 /2/20
 * @descprition: 全局异常处理类
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {


    /**
     * Default error handler object.
     *
     * @param ex the ex
     * @return the object
     */
    @ResponseBody
    @ExceptionHandler(value = MyException.class)
    public Object defaultErrorHandler(MyException ex) {
        Map resultMap = new HashMap();
        resultMap.put("code", ex.getCode());
        resultMap.put("msg", ex.getMsg());
        return resultMap;
    }







}

package com.timebook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: StudentController
 * @author: xiongzl
 * @date: 2018/2/17
 * @descprition: Student 控制类
 */
@RestController
@RequestMapping("/api/student")
public class StudentController {

    /**
     * @title: StudentController
     * @author: xiongzl
     * @date: 2018/2/17
     * @descprition: 获取学生信息
     */
    @RequestMapping("/getStudent")
    public String getStudent() {
        return "student-03";
    }





}

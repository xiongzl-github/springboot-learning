package com.timebook.bean;

import lombok.Data;

import java.util.Date;

/**
 * @title: Student
 * @author: xiongzl
 * @date: 2018/2/17
 * @descprition: Student对象
 */
@Data
public class Student {

    private long id;

    private String studentName;

    private int age;

    private int sex;

    private Date createTime;
}

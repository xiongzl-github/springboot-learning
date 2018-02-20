package com.timebook.bean;

import lombok.Data;

import java.util.Date;

/**
 * @title: Student
 * @author: xiongzl
 * @date: 2018/2/17
 * @descprition: Student对象
 */

public class Student {

    private long id;

    private String studentName;

    private int age;

    private int sex;

    private Date createTime;

    public long getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public int getSex() {
        return sex;
    }

    public Date getCreateTime() {
        if (null == createTime) {
            return null;
        } else {
            return (Date) createTime.clone();
        }
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setCreateTime(Date createTime) {
        if (null == createTime) {
            this.createTime = null;
        } else {
            this.createTime = (Date)createTime.clone();
        }
    }
}

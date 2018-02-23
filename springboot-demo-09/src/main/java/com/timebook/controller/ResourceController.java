package com.timebook.controller;

import com.timebook.bean.StudyResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Resource controller.
 *
 * @author xiongzl
 */
@Controller
@RequestMapping("/api/res")
public class ResourceController {

    /**
     * Gets resources.
     *
     * @return the resources
     */
    @RequestMapping(value = "/getResources", method = RequestMethod.GET)
    public ModelAndView getResources() {
        List<StudyResource> resources = new ArrayList<>();
        StudyResource res =new StudyResource("官方参考文档","Spring Boot Reference Guide","http://docs.spring.io/spring-boot/docs/1.5.1.RELEASE/reference/htmlsingle/#getting-started-first-application");
        resources.add(res);
        res =new StudyResource("官方SpriongBoot例子","官方SpriongBoot例子","https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples");
        resources.add(res);
        res =new StudyResource("龙国学院","Spring Boot 教程系列学习","http://www.roncoo.com/article/detail/125488");
        resources.add(res);
        res =new StudyResource("嘟嘟MD独立博客","Spring Boot干货系列 ","http://tengj.top/");
        resources.add(res);
        res =new StudyResource("后端编程嘟","Spring Boot教程和视频 ","http://www.toutiao.com/m1559096720023553/");
        resources.add(res);
        res =new StudyResource("程序猿DD","Spring Boot系列","http://www.roncoo.com/article/detail/125488");
        resources.add(res);
        res =new StudyResource("纯洁的微笑","Sping Boot系列文章","http://www.ityouknow.com/spring-boot");
        resources.add(res);
        res =new StudyResource("CSDN——小当博客专栏","Sping Boot学习","http://blog.csdn.net/column/details/spring-boot.html");
        resources.add(res);
        res =new StudyResource("梁桂钊的博客","Spring Boot 揭秘与实战","http://blog.csdn.net/column/details/spring-boot.html");
        resources.add(res);
        res =new StudyResource("林祥纤博客系列","从零开始学Spring Boot ","http://412887952-qq-com.iteye.com/category/356333");
        resources.add(res);
        //没有整合Vanilla Cream UI Kit
        //ModelAndView modelAndView = new ModelAndView("/index");
        //整合了Vanilla Cream UI Kit
        ModelAndView modelAndView = new ModelAndView("/template");
        modelAndView.addObject("resources", resources);
        return modelAndView;
    }








}

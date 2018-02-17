package com.timebook;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: BasicController
 * @author: xiongzl
 * @date: 2018/2/17
 * @descprition: springboot Controller的基本写法介绍
 * @RestController: 相当于@Controller以及@ResponseBody
 */
@RestController
public class BasicController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}

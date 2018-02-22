package com.timebook.controller;

import com.timebook.bean.DataBaseInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * The type Db controller.
 *
 * @author xiongzl
 */
@RestController
@RequestMapping("/api/db")
public class DBController {

    @Resource
    private DataBaseInfo dataBaseInfo;

    /**
     * Gets db info.
     *
     * @return the db info
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Object getDBInfo() {
        DataBaseInfo dbInfo = new DataBaseInfo(dataBaseInfo.getName(), dataBaseInfo.getPassword());
        return dbInfo;
    }




}

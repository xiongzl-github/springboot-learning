package com.timebook.Scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @title: ScheduledTasks
 * @author: xiongzl
 * @date: 2018/2/20
 * @descprition: 定时任务
 */
@Component
public class ScheduledTasks {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("现在时间: " + sdf.format(new Date()));
    }


}

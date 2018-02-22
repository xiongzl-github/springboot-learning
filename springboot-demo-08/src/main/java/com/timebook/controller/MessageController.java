package com.timebook.controller;

import com.timebook.bean.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * The type Message controller.
 *
 * @author xiongzl
 */
@RestController
@RequestMapping("/api/message")
public class MessageController {

    @Resource
    private Message message;

    /**
     * Gets message.
     *
     * @return the message
     */
    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public Object getMessage() {
        Message msg = new Message();
        msg.setMsg(message.getMsg());
        return msg;
    }


}

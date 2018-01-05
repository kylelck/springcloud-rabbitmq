package com.lick.send;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @description：
 * @author: lick
 * @date: 2018年01月03日 17:02
 * @copyright: 版权归所有
 */
@Component
public class Sender {
    /** 引入mq的接口 */
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello"+new Date();
        System.out.println("Sender : "+context);
        this.amqpTemplate.convertAndSend("hello",context);
    }
}

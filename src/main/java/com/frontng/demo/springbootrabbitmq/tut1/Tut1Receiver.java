package com.frontng.demo.springbootrabbitmq.tut1;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * 订阅者，监听队列名为hello的队列
 * @author Front Ng
 * @date 2019-06-12 15:06
 **/
@RabbitListener(queues = "hello")
public class Tut1Receiver {


    /**
     * 监听处理
     * @param in
     */
    @RabbitHandler
    public void receive(String in){
        System.out.println(" [x] 接收到 '"+ in + "'");
    }
}

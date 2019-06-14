package com.frontng.demo.springbootrabbitmq.tut1;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 消息发布者
 *
 * @author Front Ng
 * @date 2019-06-12 15:08
 **/
public class Tut1Sender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    /**
     * 定时发布消息
     */
    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void send() {
        String message = "Hello World! " + System.currentTimeMillis();
        System.out.println(" [x] 发送 '" + message + "'");
        this.rabbitTemplate.convertSendAndReceive(queue.getName(), message);
    }
}

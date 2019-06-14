package com.frontng.demo.springbootrabbitmq.tut1;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 配置
 *
 * @author Front Ng
 * @date 2019-06-12 15:04
 **/
@Profile({"tut1"})
@Configuration
public class Tut1Config {

    /**
     * 注入队列名为hello的队列
     *
     * @return
     */
    @Bean
    public Queue queue() {
        return new Queue("hello");
    }

    /**
     * 注入订阅者代码
     *
     * @return
     */
    @Profile("receiver")
    @Bean
    public Tut1Receiver receiver() {
        return new Tut1Receiver();
    }


    /**
     * 注入消息发布者代码
     *
     * @return
     */
    @Profile("sender")
    @Bean
    public Tut1Sender sender() {
        return new Tut1Sender();
    }
}

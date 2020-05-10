package com.example.activemq.ispring.queue;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
	p2p模式时，消费者启动类
 */
public class QueueConsumerBoot {
    @SuppressWarnings({"unused", "resource"})
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("queue_config/consumer.xml");
    }
}

package com.example.activemq.ispring.topic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
	订阅模式，消费者启动类
 */
public class TopicConsumerBoot {
    @SuppressWarnings({"unused", "resource"})
    public static void main(String[] args) {
        if ("notdurable".equals(args[0])) {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("topic_config/consumer_not_durable.xml");
        } else {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("topic_config/consumer_durable.xml");
        }
    }
}

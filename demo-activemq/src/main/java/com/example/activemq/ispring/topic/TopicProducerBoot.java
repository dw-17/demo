package com.example.activemq.ispring.topic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
	订阅模式，生产者启动类
 */
public class TopicProducerBoot {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("topic_config/producer.xml");
        TopicProducerService service = context.getBean(TopicProducerService.class);
        for (int i = 0; i < 100; i++) {
            service.sendMessage(String.valueOf(i));
        }
        context.close();
    }
}

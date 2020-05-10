package com.example.activemq.ispring.queue;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
	p2p模式时，生产者启动类
 */
public class QueueProducerBoot {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("queue_config/producer.xml");
        QueueProducerService service = context.getBean(QueueProducerService.class);
        for (int i = 0; i < 100; i++) {
            service.sendMessage(String.valueOf(i));
        }
        context.close();
    }
}

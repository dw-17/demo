package com.example.activemq.ispring.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.*;

/*
	订阅模式，生产者发送类
 */
public class TopicProducerServiceImpl implements TopicProducerService {
    @Autowired
    JmsTemplate jmsTemplate;

    @Resource(name = "topicDestination")
    Destination destination;

    @Override
    public void sendMessage(String message) {
        //使用JMSTemplate发送消息
        jmsTemplate.send(destination, new MessageCreator() {
            //创建消息
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage("Producer message by topic--->" + message);
                return textMessage;
            }
        });
        System.out.println("Send message by topic--->" + message);
    }
}

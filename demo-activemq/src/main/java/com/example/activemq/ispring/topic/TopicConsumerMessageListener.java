package com.example.activemq.ispring.topic;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/*
	订阅模式，消费者监听类
 */
public class TopicConsumerMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("Receive message by topic--->" + textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}

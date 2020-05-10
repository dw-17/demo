package com.example.activemq.ispring.queue;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/*
	p2p模式时，消费者监听类
 */
public class QueueConsumerMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("Receive message by queue--->" + textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}

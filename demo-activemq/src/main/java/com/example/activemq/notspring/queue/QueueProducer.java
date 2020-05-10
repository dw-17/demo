package com.example.activemq.notspring.queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/*
	p2p模式时，生产者启动类
 */
public class QueueProducer {
    private static final String url = "tcp://192.168.1.100:61616";
    private static final String queueName = "queue-test";

    public static void main(String[] args) throws JMSException {
        // 1.创建ConnectionFactory
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);

        // 2.创建Connection
        Connection connection = connectionFactory.createConnection();

        // 3.启动链接(链接物理上消息服务器)
        connection.start();

        // 4.创建会话
        Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);

        // 5.创建一个目标
        Destination destination = session.createQueue(queueName);

        // 6.创建一个生产者
        MessageProducer messageProducer = session.createProducer(destination);

        for (int i = 0; i < 100; i++) {
            // 7.创建消息
            TextMessage textMessage = session.createTextMessage("Producer message by queue--->" + i);

            // 8.发送消息
            messageProducer.send(textMessage);
            System.out.println("Send message by queue--->" + textMessage);
        }

        // 9.关闭链接
        connection.close();
    }
}

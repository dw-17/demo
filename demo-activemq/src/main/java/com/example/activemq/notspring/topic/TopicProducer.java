package com.example.activemq.notspring.topic;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/*
	订阅模式，生产者启动类
 */
public class TopicProducer {
    private static final String url = "tcp://192.168.1.100:61616";// 默认ActiveMQ消息服务器的端口号为61616
    private static final String topicName = "topic-test";

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
        Destination destination = session.createTopic(topicName);

        // 6.创建一个生产者
        MessageProducer messageProducer = session.createProducer(destination);

        // 6.1消息持久传输设置
        messageProducer.setDeliveryMode(DeliveryMode.PERSISTENT);//发送的消息是否进行本地持久化，默认持久化

        for (int i = 0; i < 100; i++) {
            // 7.创建消息
            TextMessage textMessage = session.createTextMessage("Producer message by topic--->" + i);

            // 8.发送消息
            messageProducer.send(textMessage);
            System.out.println("Send message by topic--->" + textMessage);
        }

        // 9.关闭链接
        connection.close();
    }
}

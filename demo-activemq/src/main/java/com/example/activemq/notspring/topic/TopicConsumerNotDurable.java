package com.example.activemq.notspring.topic;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/*
	订阅模式，消费者启动类
 */
public class TopicConsumerNotDurable {
    private static final String url = "tcp://192.168.1.100:61616";//默认ActiveMQ消息服务器的端口号为61616
    private static final String topicName = "topic-test";

    public static void main(String[] args) throws JMSException {
        // 1.创建ConnectionFactory!
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);

        // 2.创建Connection
        Connection connection = connectionFactory.createConnection();

        // 3.启动链接(链接物理上消息服务器)
        connection.start();

        // 4.创建会话
        Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);

        // 5.创建一个目标
        Destination destination = session.createTopic(topicName);

        // 6.创建一消费者
        MessageConsumer messageConsumer = session.createConsumer(destination);

        // 7.创建一个监听
        messageConsumer.setMessageListener(new MessageListener() {
            @Override
            public void onMessage(Message message) {
                TextMessage textMessage = (TextMessage) message;
                try {
                    System.out.println("Receive message by topic--->" + textMessage.getText());
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        });

        // 8.关闭链接
        // connection.close();//监听的时候不可以关闭链接，因为是一个异步接受的过程
    }
}

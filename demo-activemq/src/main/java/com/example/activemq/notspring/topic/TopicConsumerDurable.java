package com.example.activemq.notspring.topic;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/*
	订阅模式，消费者启动类
 */
public class TopicConsumerDurable {
    private static final String url = "tcp://192.168.1.100:61616";// 默认ActiveMQ消息服务器的端口号为61616
    private static final String topicName = "topic-test";
    private static final String clientID = "client_ids";

    public static void main(String[] args) throws JMSException {
        // 1.创建ConnectionFactory!
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);

        // 2.创建Connection
        Connection connection = connectionFactory.createConnection();

        // 2.1消息持久订阅设置
        connection.setClientID(clientID);// 持久订阅需要设置这个，据说，负载情况下每个客户端id要不同，不然会报错

        // 3.启动链接(链接物理上消息服务器)
        connection.start();

        // 4.创建会话
        Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);

        // 5.创建一个目标
        Topic destination = session.createTopic(topicName);

        // 5.1消息持久订阅设置(与上面的2.1要同时设置)
        MessageConsumer messageConsumer = session.createDurableSubscriber(destination, clientID);

        // 6.创建一个监听
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

        // 7.关闭链接
        // connection.close();//监听的时候不可以关闭链接，因为是一个异步接受的过程
    }
}

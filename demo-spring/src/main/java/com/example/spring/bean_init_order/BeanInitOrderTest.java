package com.example.spring.bean_init_order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings({"unused", "resource"})
public class BeanInitOrderTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring.xml");
	}
}

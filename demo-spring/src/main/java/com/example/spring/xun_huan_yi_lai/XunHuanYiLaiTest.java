package com.example.spring.xun_huan_yi_lai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings({"unused", "resource"})
public class XunHuanYiLaiTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring.xml");
	}
}

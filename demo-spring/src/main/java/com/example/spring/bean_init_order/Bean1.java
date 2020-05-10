package com.example.spring.bean_init_order;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;

public class Bean1 implements InitializingBean {
	public Bean1() {
		System.out.println("This is Bean1 construction");
	}

	public void xmlInit() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Bean1 init method--->xmlInit");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Bean1 init method--->afterPropertiesSet");
	}

	@PostConstruct
	public void annotationInit() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Bean1 init method--->annotationInit");
	}
}

package com.example.spring.bean_init_order;

import org.springframework.beans.factory.InitializingBean;

public class Bean2 implements InitializingBean {
	public Bean2() {
		System.out.println("This is Bean2 construction");
	}

	public void xmlInit() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Bean2 thread sleep compile");
			}
		}).start();
		System.out.println("Bean2 init method--->xmlInit");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Bean2 init method--->afterPropertiesSet");
	}
}

package com.example.springboot.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Component;

import com.example.springboot.entity.User;

/**
 * @Bean是一个方法级别上的注解，主要用在@Configuration注解的类里，也可以用在@Component注解的类里。添加的bean的名字为方法名
 *
 */
@Component
public class AnnotationBean {
	@Bean(name = { "userBean", "userbean", "Userbean" }, initMethod = "init") // 指定bean别名  + 初始化方法
	@Description("Provides a basic example of a bean") // 描述
//	@Scope("prototype")//测试init方法时，需要注释掉scope
	public User userBean() {
		return new User();
	}
}

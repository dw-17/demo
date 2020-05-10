package com.example.spring.load_context_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SuppressWarnings({"unused", "resource"})
public class LoadContextMethodTest {
    // 引用应用上下文用ClassPathXmlApplicationContext
    public static void method1() {
        // 推荐使用(因为部署到server上的时候，都用的classpath路径，而不是hardcode的路径)
        ApplicationContext factory1 = new ClassPathXmlApplicationContext("classpath:spring.xml");
        // 不推荐使用(使用maven目录结构开发时，本地可以使用)
        ApplicationContext factory3 = new ClassPathXmlApplicationContext("src/main/resources/spring.xml");
        // 不推荐使用(使用IDE开发时，本地可以使用)
        ApplicationContext factory2 = new ClassPathXmlApplicationContext("file:C:/Users/X/workspace/demo-spring-test/src/main/resources/spring.xml");
    }

    // 用文件系统的路径引用应用上下文用FileSystemXmlApplicationContext
    public static void method2() {
        // 推荐使用
        ApplicationContext factory1 = new FileSystemXmlApplicationContext("classpath:spring.xml");
        // 不推荐使用
        ApplicationContext factory2 = new FileSystemXmlApplicationContext("src/main/resources/spring.xml");
        ApplicationContext factory3 = new FileSystemXmlApplicationContext("file:C:/Users/X/workspace/demo-spring-test/src/main/resources/spring.xml");
        ApplicationContext factory4 = new FileSystemXmlApplicationContext("C:/Users/X/workspace/demo-spring-test/src/main/resources/spring.xml");
    }

    public static void main(String[] args) {
        method1();
        // method2();
    }
}

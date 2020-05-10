package com.example.jdk.Static;

public class Demo1 {
	public void f1() {//静态方法可以跨类调用，格式是：类名 静态方法名();
		StaticDemo.hhhhh();
		StaticDemo.a = 200;
	}
}

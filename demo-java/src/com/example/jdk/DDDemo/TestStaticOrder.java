package com.example.jdk.DDDemo;

public class TestStaticOrder {
	static {
		System.out.println("我是静态块");
	}
	
	{
		System.out.println("我是构造块");
	}
	
	public TestStaticOrder(){
		System.out.println("我是构造方法");
	}
	
	public static void staticMethod(){
		System.out.println("我是静态方法");
	}
	
	public static void main(String[] args) {
		new TestStaticOrder();
		new TestStaticOrder();
		new TestStaticOrder();
	}
}

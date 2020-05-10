package com.example.jdk.InnerClass;

/**
 * 方法中定义内部类
 * @author WD
 * 注:JDK1.8以后方法体内的变量和方法体的参数不需要加final，1.7以前需要加
 */
class OuterM{
	private String msg = "Hello World!";
	
	public void fun(final int i){
		final double price = 99.9;
		class Inner {
			public void print(){
				System.out.println(msg);
				System.out.println("价钱 : " + price + "\n i : " + i);
			}
		}
		new Inner().print();
	}
}

public class TestDemo4 {
	public static void main(String[] args) {
		OuterM out = new OuterM();
		out.fun(100);
	}
	
}

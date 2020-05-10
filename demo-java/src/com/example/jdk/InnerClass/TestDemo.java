package com.example.jdk.InnerClass;

/**
 * 内部类可以直接使用外部类的私有属性
 * @author WD
 *
 */
class OuterX{
	private String msg = "Hello World!";
	class Inner {
		public void print(){
			System.out.print(msg);//内部类可以直接使用外部类的属性msg
		}
	}
	//给外部类提供一个方法，用于访问内部类的属性和方法
	public void fun(){
		new Inner().print();
	}
}

public class TestDemo {
	public static void main(String[] args) {
		OuterX out = new OuterX();
		out.fun();
	}
}

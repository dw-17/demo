package com.example.jdk.InterfaceDemo;

class Outer { // 定义外部类
	private static String info = "Hello";

	static class Inner { // 定义内部类，是 static 变为外部类
		public void print() {
			System.out.println(info); // 输出 info 属性
		}
	};
};

public class InnerDemo04 {
	public static void main(String args[]) {
		// Outer.Inner in = new Outer().new Inner() ;
		Outer.Inner in = new Outer.Inner();
		in.print();
	}
};
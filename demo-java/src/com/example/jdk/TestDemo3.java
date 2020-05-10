package com.example.jdk;

/**
 * 外部类访问static定义的内部类的方法
 * @author WD
 *
 */
class Outer{
	private static String msg = "Hello World!";
	static class Inner {
		private String info = "世界，你好！";
		public void print(){
			System.out.print(msg);
		}
	}
}

public class TestDemo3 {
	public static void main(String[] args) {
		//外部类访问static静态内部类时，内部类的实例化语法
		//外部类.内部类   对象  = new 外部类.内部类();
		Outer.Inner in = new Outer.Inner();
		in.print();
	}
}

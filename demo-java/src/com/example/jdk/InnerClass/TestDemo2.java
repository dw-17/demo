package com.example.jdk.InnerClass;

/**
 * 外部类访问内部类的方法
 * @author WD
 *
 */
class Outer{
	private String msg = "Hello World!";
	class Inner {
		private String info = "世界，你好！";
		public void print(){
			System.out.print(Outer.this.msg);
		}
	}
}

public class TestDemo2 {
	public static void main(String[] args) {
		//外部类访问内部类时，内部类的实例化语法
		//外部类.内部类   对象  = new 外部类().new 内部类();
		Outer.Inner in = new Outer().new Inner();
		in.print();
	}
}

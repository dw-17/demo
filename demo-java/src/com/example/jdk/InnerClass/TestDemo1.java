package com.example.jdk.InnerClass;

/**
 * 外部类可以直接访问内部类的    *私有*    属性
 * @author WD
 *
 */
class OuterP{
	private String msg = "Hello World!";
	class Inner {
		private String info = "世界，你好！";
		public void print(){
			System.out.print(msg);
		}
	}
	//外部类可以世界访问内部类的私有属性！！
	public void fun(){
		Inner in = new Inner();
		System.out.println(in.info);
	}
}

public class TestDemo1 {
	public static void main(String[] args) {
		OuterP out = new OuterP();
		out.fun();
	}
}

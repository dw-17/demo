package com.example.jdk.Static;



//当发生继承关系时，一定要记住子类继承了父类的属性和方法，除了私有的意外
public class Demo17 extends Demo16 {
	public void fun() {
		Demo16 demo16 = new Demo16();
	}

	static {
		System.out.println("Demo17静态块被执行");
	}

	public static void main(String[] args) {
		Demo17 demo17 = new Demo17();
		// demo17.fun();

	}
}

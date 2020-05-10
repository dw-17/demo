package com.example.jdk.Static;


//static静态块高于一切最先执行，并且不用创建对象
public class Demo16 {
	public Demo16() {// 构造方法用于初始化，因此常常使用
		System.out.println("Demo16默认形式构造方法被执行");
	}

	// static静态块在类被加载的时候执行
	static {
		System.out.println("Demo16静态块被执行");
		System.out.println("$$$$$$$$");
	}

	public static void main(String[] args) {
		Demo16 demo = new Demo16();
	}
}

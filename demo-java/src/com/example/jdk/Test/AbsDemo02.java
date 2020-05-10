package com.example.jdk.Test;

abstract class Demo1 { // 抽象类
	public void print() {
		System.out.println("Hello World!!!父类");
	}

	public abstract void fun(); // 抽象方法
};

class DemoImpl extends Demo1 {
	public void fun() {
	}
	public void print() {
		super.print();
		System.out.println("Hello World!!!子类");
	}
};

public class AbsDemo02 {
	public static void main(String args[]) {
		DemoImpl di = new DemoImpl();
		di.print();
	}
};

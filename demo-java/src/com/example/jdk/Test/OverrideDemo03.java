package com.example.jdk.Test;

class A1 {
	public void print() { // 定义方法
		System.out.println("hello");
	}
	public void fun(){
		System.out.println("QQQQQQQQQQQQ");
	}
};

class B1 extends A1 {
	public void print() {
//		super.print(); // 直接从父类中找到 print()方法
		this.fun(); // 直接从父类中找到 print()方法
		System.out.println("world");
	}
	public void fun(){
		System.out.println("QQQQQQQQQQQQ子类");
	}
};

public class OverrideDemo03 {
	public static void main(String args[]) {
		B1 b = new B1();
		b.print();
	}
};
package com.example.jdk.Test;

class A22 {
	public void print() {
		System.out.println("A --> public void print(){}");
	}

	public void fun() {
		this.print();
	}
};

class B22 extends A22 {
	public void print() {
		System.out.println("B --> public void print(){}");
	}

	public void printB() {
		System.out.println("Hello B");
	}
};

public class PolDemo04 {
	public static void main(String args[]) {
		A22 a = new B22(); // 父类对象实例化
		// a.printB() ; // 错误的
		B22 b = (B22) a; // 向下转型
		b.printB();
	}
};

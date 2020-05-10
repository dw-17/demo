package com.example.jdk;

public class A {
	static {
		System.out.println("X");
	}

	public A() {
		System.out.println("1");
	}

	public A(String a) {
		this();
		System.out.println(a);
	}
}

//public class B extends A {
//	static {
//		System.out.println("2");
//	}
//
//	public B() {
//		super("Z");
//		System.out.println("b");
//	}
//}
//
//public class TestAB {
//	public static void main(String[] args) {
//		A ab = new B1();
//		ab = new B1();
//	}
//}
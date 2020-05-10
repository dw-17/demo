package com.example.jdk;

public class B1 extends A {
	static {
		System.out.println("2");
	}
	public B1() {
		super("Z");
		System.out.println("b");
	}
}
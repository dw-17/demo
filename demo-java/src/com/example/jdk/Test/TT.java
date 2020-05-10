package com.example.jdk.Test;



class A{
	public A(){
		System.out.println("A构造方法");
	}
}
class B extends A {
	public B(){
		System.out.println("B构造方法");
	}
}

public class TT {
	B b = new B();
}

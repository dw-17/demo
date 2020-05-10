package com.example.jdk.Test;

class Demo {
	private Temp temp;

	public Demo() {
		this.temp = new Temp(this);
		this.temp.fun();
	}

	public void print() {
		System.out.println("Hello World!!!");
	}
};

class Temp {
	private Demo demo;

	public Temp(Demo demo) {
		this.demo = demo;
	}

	public void fun() {
		this.demo.print();
	}
};

public class ThisDemo05 {
	public static void main(String args[]) {
		Demo d = new Demo();
	}
};

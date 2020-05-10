package com.example.jdk.Test;

abstract class Demoo { // 抽象类
	public Demoo() {
		System.out.println("抽象类中的构造方法！");
	}

	public void print() {
		System.out.println("Hello World!!!");
	}

	public abstract void fun(); // 抽象方法
};

class DemoImplo extends Demoo {
	public DemoImplo() {
		//super();
		System.out.println("子类中的构造方法！");
	}

	public void fun() {
	}
};

public class AbsDemo03 {
	public static void main(String args[]) {
		DemoImplo di = new DemoImplo();
		di.print();
	}
};

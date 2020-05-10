package com.example.jdk.Written_Examination_Questions.methodOfThis;
/**
 * this的用法
 * 观察如下程序的输出结果 —— 本程序没有任何实际意义，只是为了加强 this 的理解。
 * @author lenovo
 *
 */
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

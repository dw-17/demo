package com.example.jdk.InterfaceDemo;

//接口里面的属性都是，抽象、静态、常量
//接口里面的方法都是抽象的
public interface MyInterface {
//	private interface MyInterface {}//接口只能是公开的，不能为私有的，因此此句将报错
	//静态的属性，计算机里面都是斜体的
	String KEY_KNOWLEDGE = "默认是public、static、final的";//接口中的省略
	public static final int STU_NUM = 20;//static final顺序可以对调，不影响

	public abstract void fun();

	public abstract void fun2();

	String getName();

	public abstract void add(int a, int b);

	public abstract void add(double a, double b);

	public abstract double area(double pi, double r);
}

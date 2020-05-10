package com.example.jdk.Test;

class AA {
	public void print() {
		System.out.println("A --> public void print(){}");
	}

	public void fun() {
		this.print();
	}
};

class BB extends AA {
	@Override
	public void print() {
		System.out.println("B --> public void print(){}");
	}
};

public class PolDemo01 {
	public static void main(String args[]) {
		AA a = new BB(); // 子类对象变为父类对象
		a.fun();
		a.print();
//		AA a = new BB() ; // 子类对象变为父类对象
//		BB b = (BB) a ;  // 父类对象变为子类对象
//		b.fun() ;
//		b.print();
	}
};

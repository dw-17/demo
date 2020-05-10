package com.example.jdk.Extends;


public class Animal {
	public int leg;
	public int age;
	private int name;
	
	public Animal() {//"父类构造方法被调用"
		System.out.println("父类构造方法被调用");
	}
	
	public Animal(int legs) {//"调用有参数的父类构造方法"
		System.out.println("调用有参数的父类构造方法");
		leg = legs;
	}

	public void eat() {
		System.out.println("动物在吃");
	}

	public void move() {
		System.out.println("动物在移动");
	}
	
	public static void main(String[] args) {
		// 随便定义对象，随便调用你需要的构造方法
		Animal a = new Animal();
		Animal b = new Animal(2);
		Animal c = new Animal();
		Animal d = new Animal(20);
	}
}

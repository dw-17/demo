package com.example.jdk.Test;

public class Teacher {
	public static void main(String[] args) {
		Student a = new Student("李明");
		Student b = new Student("赵明");
		Student c = new Student();
		System.out.println("a同学名字是" + a.name);//李明
		System.out.println("b同学名字是" + b.name);//赵明
		c = b;
		System.out.println("c同学名字是" + c.name);//赵明
		b.changeName(a);
		System.out.println("b同学名字是" + b.name);//李明
	}
}

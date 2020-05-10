package com.example.jdk.Written_Examination_Questions.methodOfInherit;

/**
 * 继承时，子类构造方法第一句一定是父类的构造方法
 * 
 * @author lenovo
 * 
 */
// /**
// * 报错程序，因为子类构造方法第一句没有父类的构造方法
// */
// class Person {
// private String name;
// private int age;
//
// public Person(String name, int age) {
// }
// };
//
// class Student extends Person { // 现在没有编写任何代码
// private String school; // 扩充的属性
// };
//
// public class ExtDemo06 {
// public static void main(String args[]) {
// Student stu = new Student();
// }
// };

// /**
// * 子类的构造方法第一句一定调用父类的构造方法
// * 不管子类如何操作，肯定都会调用父类中的构造方法。
// * @author lenovo
// *
// */
// class Person {
// private String name;
// private int age;
//
// public Person() {
// System.out.println("** 父类的无参构造！");
// }
//
// public Person(String name, int age) {
// }
// };
//
// class Student extends Person { // 现在没有编写任何代码
// private String school; // 扩充的属性
//
// public Student() {
// //super() ; //默认调用父类中的无参构造，可以省略
// System.out.println("** 子类的无参构造！");
// }
// };
//
// public class ExtDemo06 {
// public static void main(String args[]) {
// Student stu = new Student();
// }
// };


/**
 * super 就是直接由子类找到父类中指定的方法，而如果使用的是 this 的话，则会先从本类查找，如果查找到了就直接
使用，查找不到，则再去父类中查找，super 是直接从父类中查找。
 * @author lenovo
 *
 */
class A1 {
	public void print() { // 定义方法
		System.out.println("hello");
	}
	
	public void validate(){
		System.out.println("验证子类没有覆写，所以此时调用继承来的父类的方法");
	}
};

class B1 extends A1 {
	public void print() {
		super.print(); // 直接从父类中找到 print()方法
		System.out.println("world");
		this.validate();
	}
};

public class OverrideDemo03 {
	public static void main(String args[]) {
		B1 b = new B1();
		b.print();
	}
};

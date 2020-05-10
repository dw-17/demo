package com.example.jdk.Written_Examination_Questions.methodOfAbstract;

/**
 * 抽象类 
 * 1.抽象类和接口是整个 JAVA面向对象的核心部分，但是要想充分理解此概念，就必须结合对象多态性，那么先来看一下基本的语法概念。
 * 2.抽象类使用有以下原则： 1、 抽象类不能直接实例化。 2、 抽象类必须有子类，子类（如果不是抽象类）的话，则必须覆写抽象类中的全部抽象方法。 3、如果一个抽象类中没有任何一个抽象方法，依然是抽象类。 
 * 3.在抽象类的操作中，本身依然符合于单继承的问题，即：一个子类只能继承一个抽象类。 
 * 问题 ： 1、抽象类能使用 final 声明吗？ · 不能：final 声明的类不能被继承，而抽象类又必须要有子类。 
 * 		2、 抽象类中能有构造方法吗？ · 可以存在，而且依然符合于子类对象的实例化过程的要求。
 * 
 * @author lenovo
 * 
 */
// abstract class Demo { // 抽象类
// public void print() {
// System.out.println("Hello World!!!");
// }
//
// public abstract void fun(); // 抽象方法
// };
//
// class DemoImpl extends Demo {
// public void fun() {
// }
// };
//
// public class AbsDemo02 {
// public static void main(String args[]) {
// DemoImpl di = new DemoImpl();
// di.print();
// }
// };

abstract class Demo { // 抽象类
	public Demo() {
		System.out.println("抽象类中的构造方法！");
	}

	public void print() {
		System.out.println("Hello World!!!");
	}

	public abstract void fun(); // 抽象方法
};

class DemoImpl extends Demo {
	public DemoImpl() {
		super();
		System.out.println("子类中的构造方法！");
	}

	public void fun() {
	}
};

public class AbsDemo03 {
	public static void main(String args[]) {
		DemoImpl di = new DemoImpl();
		di.print();
	}
};

package com.example.jdk.Written_Examination_Questions.methodOfSingleton;

/**
 * 单例模式 1.不管外部如何变化，Singleton 类中永远只会有一个实例化对象，此种代码实现的根本原理就是在于将一个类的构造方法关闭了。
 * 2.当一个类中只能产生一个实例化对象的时候
 * ，就需要将构造方法封闭，封闭之后的操作通过一个静态方法取得本类的实例化对象，这种代码的概念非常重要，而且代码的结构必须清楚。
 * 3.如果要想继续划分的，实际上单例设计，还分成两种类型：
 · 懒汉式：当第一次使用本类的对象时，在进行对象的实例化操作。
 · 饿汉式：一个单例类中不管是否使用，都始终维护一个实例化对象。
 * 
 * @author lenovo
 * 
 */
// /**
// * 饿汉式
// * @author lenovo
// *
// */
// class Singleton {
// private static final Singleton instance = new Singleton(); // 在内部准备好一个对象
//
// public static Singleton getInstance() { // 将 instance 传递到外部去
// return instance;
// }
//
// private Singleton() {
// }
//
// public void print() {
// System.out.println("Hello World!!!");
// }
// };
//
// public class Test {
// public static void main(String args[]) {
// Singleton s1 = Singleton.getInstance();
// Singleton s2 = Singleton.getInstance();
// Singleton s3 = Singleton.getInstance();
// s1.print();
// s2.print();
// s3.print();
// }
// };

/**
 * 懒汉式
 * 
 * @author lenovo
 * 
 */
class Singleton {
	private static Singleton instance = null;

	public static Singleton getInstance() { // 将 instance 传递到外部去
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	private Singleton() {
	}

	public void print() {
		System.out.println("Hello World!!!");
	}
};

public class Test {
	public static void main(String args[]) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		s1.print();
		s2.print();
		s3.print();
	}
};

package com.example.jdk.Written_Examination_Questions.methodOfPolymorphic;

/**
 * 对象多态性：指的是父类对象和子类对象之间的转型操作
·  向上 转型（子类 ? 父类）：父类名称 父类对象 = 子类实例 ;  ，自动完成
·  向下转型（父类 ? 子类）：子类名称 子类对象 = （子类名称）父类实例 ; ，强制完成
 * @author lenovo
 *
 */
class A {
	public void print() {
		System.out.println("A --> public void print(){}");
	}

	public void fun() {
		this.print();
	}
};

class B extends A {
	public void print() {
		System.out.println("B --> public void print(){}");
	}
};

public class PolDemo01 {
	// public static void main(String args[]) {
	// A a = new B(); // 子类对象变为父类对象
	// a.fun();
	// }

	// public static void main(String args[]){
	// A a = new B() ; // 子类对象变为父类对象
	// B b = (B) a ; // 父类对象变为子类对象
	// b.fun() ;
	// }

	public static void main(String args[]) {
		A a = new A(); // 父类对象实例化
		B b = (B) a; // 父类对象 变 为子类对象
		b.fun();
	}
};







///**
// * 1.通过 instanceof 关键字可以判断某一个对象是否是某一个类的实例。
// * 2.以后在进行向下转型操作之前，一定要先使用 instanceof 关键字进行验证，验证通过了，才可以放心安全的执行向下转型的操作。
// * @author lenovo
// *
// */
//class A {
//};
//class B extends A {
//};
//public class InstanceDemo {
//	public static void main(String args[]){
//		A a = new A() ;
//		System.out.println(a instanceof A) ;
//		System.out.println(a instanceof B) ;
//	}
//};
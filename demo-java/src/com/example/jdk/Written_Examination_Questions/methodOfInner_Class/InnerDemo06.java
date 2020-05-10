package com.example.jdk.Written_Examination_Questions.methodOfInner_Class;

/**
 * 内部类 内部类 所谓的内部类就是指一个类的内部还包含了另外的一个操作类，被包含的类称为内部类，包含的类称为外部类。
 * 
 * @author lenovo
 * 
 */
// /**
// * 从以下的代码中可以观察到内部类的特点：
// *1、 缺点：破坏了一个程序的标准结构；
// *2、 优点：可以方便的访问外部类中的私有成员。
// * @author lenovo
// *
// */
// class Outer { // 定义外部类
// private String info = "Hello";
//
// class Inner { // 定 义 内 部 类
// public void print() {
// System.out.println(info); // 输出 出 info 属性
// }
// };
//
// public void fun() {
// new Inner().print();
// }
// };
//
// public class InnerDemo01 {
// public static void main(String args[]) {
// new Outer().fun();
// }
// };

// /**
// * 如果要想观察出内部类优点的话，则需要将以上的 Outer 和 Inner 类拆分成两个独立的类。
// * @author lenovo
// *
// */
// class Outer { // 定义外部类
// private String info = "Hello";
//
// public void fun() {
// new Inner(this).print();
// }
//
// public String getInfo() {
// return this.info;
// }
// };
//
// class Inner { // 定义内部类
// private Outer out;
//
// public Inner(Outer out) {
// this.out = out;
// }
//
// public void print() {
// System.out.println(out.getInfo()); // 输出 info 属性
// }
// };
//
// public class InnerDemo02 {
// public static void main(String args[]) {
// new Outer().fun();
// }
// };

// --------------------------------必须记住的语法规则！！！(3中类型的数据)-----------------------------------------//
// /**
// * 内部类语法
// * 内部类如果要被外部所调用的话，则一定要先产生外部类的实例化对象，之后再产生内部类的实例化对象。
// * @author lenovo
// *
// */
// class Outer { // 定义外部类
// private String info = "Hello";
//
// class Inner { // 定义内部类
// public void print() {
// System.out.println(info); // 输出 info 属性
// }
// };
// };
//
// public class InnerDemo03 {
// public static void main(String args[]) {
// Outer.Inner in = null; // 声明内部类的对象
// in = new Outer().new Inner();
// in.print();
// }
// };





// /**
// * 静态内部类语法
// * 在内部类的定义中，也可以使用 static 关键字完成操作，一旦使用 static 声明了一个内部类的话，则此类将成为外部
// 类，且只能访问外部类中的 static 成员。
// * @author lenovo
// *
// */
// class Outer { // 定义外部类
// private static String info = "Hello";
//
// static class Inner { // 定义内部类，是 static 变为外部类
// public void print() {
// System.out.println(info); // 输出 info 属性
// }
// };
// };
//
// public class InnerDemo04 {
// public static void main(String args[]) {
// // Outer.Inner in = new Outer().new Inner() ;//静态类不能实例化
// Outer.Inner in = new Outer.Inner();
// in.print();
// }
// };






// /**
// * 方法中的内部类(内部类可以访问外部类的私有变量)
// * @author lenovo
// *
// */
// class Outer {
// private String info = "hello";
//
// public void fun() {
// class Inner { // 方法中声明内部类
// public void print() {
// System.out.println(info);
// }
// }
// ;
// new Inner().print();
// }
// };
//
// public class InnerDemo05 {
// public static void main(String args[]) {
// new Outer().fun();
// }
// };




/**
 * 方法中的内部类(内部类访问方法中的参数需要加final关键字)
 * 此时，可以发现，一个在方法中定义的内部类，依然可以访问外部类中的属性，但是对于方法的参数，这个内部类
是无法直接访问的，如果要访问，则在参数前面必须使用 final 关键字进行声明。
 * @author lenovo
 *
 */
class Outer {
	private String info = "hello";

	public void fun(final int x) {
		final int y = 100;
		class Inner { // 方法中声明内部类
			public void print() {
				System.out.println(info);
				System.out.println("x = " + x);
				System.out.println("y = " + y);
			}
		}
		;
		new Inner().print();
	}
};

public class InnerDemo06 {
	public static void main(String args[]) {
		new Outer().fun(30);
	}
};

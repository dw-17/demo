package com.example.jdk.Written_Examination_Questions.methodOfCode_Block;

/**
 * 代码块
 * 在程序中使用“{}”括起来的一段代码就称为代码块，根据代码块出现的位置或声明的关键字的不同，分为四种：
 * 普通代码块：在一个方法中定义的代码块，称为普通代码块 构造块：在一个类中定义的代码块 静态块：使用 static 关键字声明的代码块
 * 同步代码块：留到线程再讲
 * 
 * @author lenovo
 * 
 */
// /**
// * 普通代码块
// * @author lenovo
// *
// */
// public class CodeDemo01 {
// public static void main(String args[]) {
// { // 普通代码块
// int x = 10;
// System.out.println("x = " + x);
// }
// int x = 100;
// System.out.println("x = " + x);
// }
// };



// /**
// * 构造块
// * 构造块会优先于构造方法执行，而且每当一个新的实例化对象产生时，都会调用构造块，会调用多次。
// * @author lenovo
// *
// */
// class Demo {
// {
// System.out.println("构造块。。。");
// }
//
// public Demo() {
// System.out.println("构造方法。。。");
// }
// }
//
// public class CodeDemo02 {
// public static void main(String args[]) {
// new Demo();
// new Demo();
// new Demo();
// }
// };



/**
 * 静态块
 * 在主类中定义的静态块将优先于主方法执行，而且可以发现静态块优先于构造块执行，而且只执行一次。
 * @author lenovo
 *
 */
class Demo {
	static {
		System.out.println("静态块。。。");
	}
	{
		System.out.println("构造块。。。");
	}

	public Demo() {
		System.out.println("构造方法。。。");
	}
};

public class CodeDemo03 {
	static {
		System.out.println("主方法中的静态块");
	}

	public static void main(String args[]) {
		System.out.println("-----------------------------");
		new Demo();
		new Demo();
		new Demo();
	}
};


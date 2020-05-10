package com.example.jdk.Written_Examination_Questions.methodOfInterface;

/**
 * 
 * 
 * @author lenovo
 *
 */
/**
 * 接口 (接口可以多实现，多继承)
 * 一个接口定义完成之后，实际上与抽象类的使用原则是一样的： 
 * 1、 接口必须有子类，子类（如果不是抽象类）则必须覆写接口中的全部抽象方法； 
 * 2、 接口是不能直接进行对象的实例化操作。 3、 一个子类可以同时继承（实现）多个接口，
 * 
 * 一个子类一般而言如果要实现接口又要继承抽象类的话，则必须先继承抽象类之后再实现接口
 * 
 * 所有的修饰符在接口中是否添加本身是没有任何意义的，而且接口中的方法全部都属于公共的方法操作（public）。
 * 
 * 
 * @author lenovo
 * 
 */
interface Demo { // 接口
	public static final String INFO = "hello world";

	public abstract void print();
	
	public abstract void fun();
	
//	String INFO = "hello world" ;//接口中的全部组成都是抽象方法和全局常量的话，那么以下的两种定义接口的形式是完全一样的
//	void print() ;

	
}

abstract class Flag {
	public abstract void info();
};

class Temp extends Flag implements Demo {
	public void print() {
		System.out.println(INFO);
	}

	public void fun() {
	}

	public void info() {
	}
};

public class IntDemo02 {
	public static void main(String args[]) {
		Temp temp = new Temp();
		temp.print();
	}
};


///**
// * 对于接口而言本身还有一个很大的特点：一个接口可以同时通过 extends 关键字继承多个接口。
// * @author lenovo
// *
// */
//interface A{
//	public void printA() ;
//}
//interface B{
//	public void printB() ;
//}
//interface C extends A,B{
//	public void printC() ;
//}
//class Demo implements C {
//	public void printA(){}
//	public void printB(){}
//	public void printC(){}
//};



/**
 *1.一个接口中可以定义其他的接口、抽象类或普通类，一个抽象类也可以定义内部的接口、类或抽象类。
 * 
 *2.一般而言，以上的代码并不常见，而且开发中也几乎是见不到的，但是对于一个内部接口使用 static 声明之后成为外
部接口这个概念还是在以后会应用到的。
 * @author lenovo
 *
 */
interface A{
	public void printA() ;
	static interface B{  //  外部接口
		public void printB() ;
	}
	abstract class X {
		public abstract void printX() ;
	};
}
class D1 implements A {
	public void printA(){}
	class D2 implements B{
		public void printB(){}
	};
	class D3 extends X {
		public void printX(){}
	};
};



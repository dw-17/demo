package com.example.jdk.Written_Examination_Questions.methodOfInherit;

/**
 * 覆写(重写)
 *  1.在子类中一旦方法被覆写之后，实际上最终调用的方法就是被覆写过的方法
 *  2.被覆写的方法不能拥有比父类更严格的访问控制权限。关于访问控制权限已经接触过三种：private< default（不写） < public
 *  3.记住使用 private 声明的                   方法子类                          是无法覆写的，虽然语法编译上不会产生任何的问题，但是子类中被“覆写”过的方法永远无法找到，而且这种代码在实际中没有任何的意义。
 *	4.Eclipse的快捷键提示可以看到能否调用父类私有的方法
 * @author lenovo
 * 
 */
// class A {
// public void print() { // 定义方法
// System.out.println("hello");
// }
// };
//
// class B extends A {
// public void print() {//此处将public改为private，将会报错
// System.out.println("world");
// }
// };
//
// public class OverrideDemo01 {
// public static void main(String args[]) {
// B b = new B();
// b.print();
// }
// };


/**
 * 记住使用 private 声明的 子类                        方法                  是无法覆写的，虽然语法编译上不会产生任何的问题，但是子类中被“覆写”过的
方法永远无法找到，而且这种代码在实际中没有任何的意义。
 * @author lenovo
 *
 */
class A {
	private String name = "tom";
	
	public void print() { // 定义方法
		this.getInfo();
	}

	private void getInfo() {
		System.out.println("A --> getInfo()");
	}
};

class B extends A {
	public String name = "jack";
	
	void getInfo() {
		System.out.println("B --> getInfo()");
	}
};

public class OverrideDemo02 {
	public static void main(String args[]) {
		B b = new B();
		b.print();
		System.out.println(b.name);
	}
};
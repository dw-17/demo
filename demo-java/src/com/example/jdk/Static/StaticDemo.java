package com.example.jdk.Static;

public class StaticDemo {
	public static int a = 10;

	public static void hhhhh() {
		// showA(); // 静态不能调普通，因此此句将报错
	}

	public static void hhhhh(String a) {
		// 静态方法可以重载
	}

	public void hhhhh(String a, int b) {
	}

	// 当静态量被调用时，则系统会默认的给变量名斜体字，以便区分
	public void showA() {
		hhhhh();// 本类中实例的方法(即普通的方法)可以调用静态的方法和属性
		System.out.println(a);
	}

	public static void main(String[] args) {
		StaticDemo sd1 = new StaticDemo();// sd1，sd2，sd3分别创建了属于StaticDemo类的不同的对象
		StaticDemo sd2 = new StaticDemo();
		StaticDemo sd3 = new StaticDemo();

		sd1.a = 20;// 由于静态的属性只有一个指向，所以静态属性具有共享性，所以从sd1到sd3会发生变量的覆盖，因此最终的结果为sd3
		sd2.a = 30;
		sd3.a = 100;

		sd1.showA();
		sd2.showA();
		sd3.showA();

		hhhhh();// 静态方法调用的省略
		StaticDemo.hhhhh();// 静态方法可以直接调用静态的方法和属性
		// this.hhhhh();//this不可以和静态相互使用，此句将报错
		//showA();//静态不能调用非静态方法，此句将报错

	}
}

package com.example.jdk.Written_Examination_Questions.methodOfThread;
///**
// * 单线程
// * @author lenovo
// *
// */
//public class SingleThread {
//	public static void main(String[] args) {
//		new TestThread().run();
//		while (true) {
//			System.out.println("main:" + Thread.currentThread().getName());
//		}
//	}
//}
//
//class TestThread {
//	public void run() {
//		while (true) {
//			System.out.println("run:" + Thread.currentThread().getName());
//		}
//	}
//}

///**
// * 多线程
// */
//public class MultiThread {
//	public static void main(String[] args) {
//		new TestMultiThread().start();
//		while (true) {
//			System.out.println("main:" + Thread.currentThread().getName());
//		}
//	}
//}
//
//class TestMultiThread extends Thread {
//	public void run() {
//		while (true) {
//			System.out.println("run:" + Thread.currentThread().getName());
//		}
//	}
//}

///**
// * 继承Thread类的程序演示
// * @author lenovo
// *
// */
//class ThreadDemo1 extends Thread {
//	public void run() {
//		for (int i = 0; i <= 5; i++) {
//			System.out.println("线程0 : " + Thread.currentThread().getName() + " is running"
//					+ i);
//		}
//	}
//}
//
//class ThreadDemo2 extends Thread {
//	public void run() {
//		for (int i = 0; i <= 5; i++) {
//			System.out.println("线程1 : " + Thread.currentThread().getName() + " is running"
//					+ i);
//		}
//	}
//}
//
//public class ThreadDemo extends Thread {
//	public static void main(String[] args) {
//		new ThreadDemo1().start();
//		new ThreadDemo2().start();
//		for (int i = 0; i <= 5; i++) {
//			System.out.println("线程main : " + Thread.currentThread().getName() + " is running"
//					+ i);
//		}
//	}
//}

/**
 * 实现Runnable接口的程序演示
 */
class RunnableDemo1 implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("线程0 : " + Thread.currentThread().getName() + "  is running  "
					+ i);
		}
	}
}

class RunnableDemo2 implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("线程1 : " + Thread.currentThread().getName() + "  is running  "
					+ i);
		}
	}
}

public class RunnableDemo {
	public static void main(String[] args) {
		new Thread(new RunnableDemo1()).start();
		new Thread(new RunnableDemo2()).start();
		for (int i = 0; i <= 5; i++) {
			System.out.println("线程main : " + Thread.currentThread().getName() + "  is running  "
					+ i);
		}
	}
}

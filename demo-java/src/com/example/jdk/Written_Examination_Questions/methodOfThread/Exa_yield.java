package com.example.jdk.Written_Examination_Questions.methodOfThread;

/**
 * join方法实例
 * 
 * @author lenovo
 * 
 */
// class TeacherThread implements Runnable {
// public void run() {
// System.out.println("老师准备上课");
// System.out.println("发现粉笔没了");
// System.out.println("让学生到前台去取");
// Thread student = new Thread(new StudentThread());
// student.start();
// System.out.println("老师等待学生把粉笔取回来");
// try {
// student.join();
// } catch (InterruptedException e) {
// System.err.println("发生异常!");
// System.err.println("老师中断讲课");
// System.exit(0);
// }
// System.out.println("老师继续讲课");
// }
// }
//
// class StudentThread implements Runnable {
// public void run() {
// System.out.println("学生到前台去取粉笔");
// System.out.println("学生取粉笔需要十秒钟");
// try {
// for (int i = 1; i <= 10; i++) {
// Thread.sleep(1000);
// System.out.println(i + "秒钟");
// }
// } catch (InterruptedException e) {
// System.err.println("发生异常!");
// }
// System.out.println("学生取粉笔回来了");
// }
// }
//
// public class Lesson {
// public static void main(String[] args) {
// Thread teacher = new Thread(new TeacherThread());
// teacher.start();
// }
// }

public class Exa_yield implements Runnable {
	public void run() {
		for (int k = 0; k < 10; k++) {
			if (k == 5 && Thread.currentThread().getName().equals("t1")) {
				Thread.yield();
			}
			System.out.println(Thread.currentThread().getName() + ":" + k);
		}
	}

	public static void main(String[] args) {
		Exa_yield r = new Exa_yield();
		Thread t1 = new Thread(r, "t1");
		Thread t2 = new Thread(r, "t2");
		// t1.setPriority(Thread.MAX_PRIORITY);
		// t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		for (int i = 0; i <= 5; i++) {
			System.out.println("线程main : " + Thread.currentThread().getName() + " is running"
					+ i);
		}
	}
}

package com.example.jdk.Written_Examination_Questions.methodOfQuote;
/**
 * 引用
 * 引用的运用--->内存关系图
 * @author lenovo
 *
 */
class Demo {
	private String str = "hello";

	public void setStr(String str) {
		this.str = str;
	}

	public String getStr() {
		return this.str;
	}
};

public class RefDemo03 {
	public static void main(String args[]) {
		Demo d1 = new Demo();
		d1.setStr("world");
		fun(d1);
		System.out.println(d1.getStr());
	}

	public static void fun(Demo d2) {
		d2.setStr("!!!");
	}
};
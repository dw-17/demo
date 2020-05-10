package com.example.jdk.Written_Examination_Questions.methodOfCompare_Object;
/**
 * 对象比较
 * 对象比较的核心就是判断两个对象中的属性是否相等
 * @author lenovo
 *
 */
class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean compare(Person person) {
		if (this == person) { // 地址相等了
			return true;
		}
		if (this.name.equals(person.name) && this.age == person.age) {
			return true;
		} else {
			return false;
		}
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
}

public class CompareDemo02 {
	public static void main(String args[]) {
		Person per1 = new Person("张三", 30);
		Person per2 = new Person("张三", 30);
		if (per1.compare(per2)) {
			System.out.println("是同一个人！");
		} else {
			System.out.println("不是同一个人！");
		}
	}
}

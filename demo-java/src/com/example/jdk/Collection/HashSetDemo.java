package com.example.jdk.Collection;

import java.util.Stack;

public class HashSetDemo {
	public static void main(String[] args) {
//		Set<String> all = new HashSet<String>();
//		all.add("B");
//		all.add("B");
//		all.add("X");
//		all.add("C");
//		all.add("A");
//		System.out.println(all);
		Stack<String> s = new Stack<String>();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
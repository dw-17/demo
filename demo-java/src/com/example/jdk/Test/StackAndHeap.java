package com.example.jdk.Test;

public class StackAndHeap {
	public static void main(String[] args) {
		String a = "abcdefg";
		String b = new String("abcdefg");
		System.out.println(a.equals(b));
		System.out.println(a == b);
	}
}

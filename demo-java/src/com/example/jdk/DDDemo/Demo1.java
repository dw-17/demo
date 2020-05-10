package com.example.jdk.DDDemo;

public class Demo1 {
	public static void main(String[] args) {
		String name = "国";
		byte[] rr = name.getBytes();
		for(int i = 0; i < rr.length; i++){
			System.out.println(rr[i]);
		}
	}
}

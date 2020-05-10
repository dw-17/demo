package com.example.jdk;

public class Base {
	private String baseName = "base";
	public Base(){
		callName();
	}
	public void callName(){
		System.out.println(baseName);
	}
//	static class Sub extends Base{
//		private String baseName = "base";
//		public void callName(){
//			System.out.println(baseName);
//		}
//	}

	public static void main(String[] args) {
//		Sub b = new Sub();
		Base a = new Base();
	}
}

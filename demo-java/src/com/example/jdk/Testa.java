package com.example.jdk;

public class Testa {
	public static void main(String[] args) {
		char c = 'b';
		switch (c) {
		case 'A': {
			System.out.println("成绩优秀！");
//			break;
		}
		case 'B': {
			System.out.println("成绩中上！");
//			break;
		}
		case 'C': {
			System.out.println("成绩中等！");
//			break;
		}
		default: {
			System.out.println("没有满足的条件！");
			break;
		}
		}

	}
}

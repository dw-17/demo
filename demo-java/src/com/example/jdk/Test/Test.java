package com.example.jdk.Test;

public class Test {
	public static void main(String args[]) {
		String str = "helloworld";
		byte b[] = str.getBytes(); // 将字符串变为字节数组
		System.out.println(new String(b));
		System.out.println(new String(b, 0, 5));
		for(int i = 0; i < b.length; i++){
			System.out.println(b[i]);
		}
		
//		String str = "192.168.1.3";
//		String s[] = str.split("\\.");
//		for (int x = 0; x < s.length; x++) {
//			System.out.print(s[x] + "、");
//		}
	}
}

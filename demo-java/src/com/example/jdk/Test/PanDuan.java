package com.example.jdk.Test;
/**
 * if,else if,else的执行次数
 * @author lenovo
 *
 */
public class PanDuan {
	public void test(){
		int a = 2;
		if(a > 0){
			System.out.println("1");
		}else if(a > 1){
			System.out.println("2");
		}else{
			System.out.println("3");
		}
	}
	
	public static void main(String[] args) {
		new PanDuan().test();
	}
}

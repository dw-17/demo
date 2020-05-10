package com.example.jdk.Test;
class BDemo {//---1
	
};
class ADemo {//---2
	private BDemo b = new BDemo();
}
public class TestDemo {
	public static void main(String[] args) {
		BDemo testB = new BDemo();//---1
		ADemo testA = new ADemo();//---2
	}
}

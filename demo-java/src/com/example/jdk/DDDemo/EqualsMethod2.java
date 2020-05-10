package com.example.jdk.DDDemo;

class Value {
	Value(){
		return;
	};
	int i;
}

public class EqualsMethod2 {
	public static void main(String[] args) {
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i = 100;
		System.out.println(v1.equals(v2));
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		System.out.println(n1.equals(n2));
	}
}

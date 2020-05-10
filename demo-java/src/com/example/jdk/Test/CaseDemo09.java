package com.example.jdk.Test;
abstract class Demop{
	public Demop(){
		this.print();
	}
	public abstract void print();
//	public  void print(){
//		System.out.println("QQQ!!!");
//	};
}
class DemoImpll extends Demop{
	private int x = 10;
	public DemoImpll(int x){
		super();
		this.x = x;
	}
	@Override
	public void print() {
		System.out.println("x = " + this.x);
	}
	
}
public class CaseDemo09 {
	public static void main(String[] args) {
		new DemoImpll(100);
		new DemoImpll(100).print();
		Demop a = new DemoImpll(100);
		a.print();
	}
}

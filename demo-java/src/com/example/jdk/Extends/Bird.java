package com.example.jdk.Extends;

//方法的覆盖(完全一样)；
public class Bird extends Animal {
	public Bird() {//如果没有写父类构造方法的调用，那么在子类构造器的第一行将默认输出父类的无参构造器
//		super(2);//此时加上这句话，看控制台第一句显示的为父类的含参构造方法
		System.out.println("子类构造方法的第一行,一定是调用父类构造方法");
	}
	
	public String feather;

	@Override//每一次覆盖(又称为重写)都需要加注释文档@Override
	public void eat() {
		super.eat();//super父类的对象，this本类的对象
	}

	@Override
	public void move() {
		super.move();
		int A = super.leg;//此种语法合理
	}

	public void fly() {
		System.out.println("鸟在飞");
	}

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.eat();
		bird.move();
		bird.fly();
	}
}

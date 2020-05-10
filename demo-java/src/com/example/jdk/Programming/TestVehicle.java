package com.example.jdk.Programming;

public class TestVehicle extends Vehicle{
	String pinPai;
	String yanSe;
	double suDu;
	
	//子类构造方法
	public TestVehicle(String brand, String color) {
		super(brand, color);//所谓的super就是一个提示，告诉我子类继承了父类，可以用了，用法两种1.new 子类().属性  2.super.属性
		this.pinPai = super.brand;
		this.yanSe = super.color;
		this.suDu = super.speed;
	}
	
	@Override
	public void run(){
		System.out.println("汽车品牌为：" + pinPai + "\n汽车颜色为:" + yanSe + "\n汽车速度为：" + suDu);
	}
	
	public static void main(String[] args) {
		TestVehicle tt = new TestVehicle("benz", "black");
		tt.run();
	}
}

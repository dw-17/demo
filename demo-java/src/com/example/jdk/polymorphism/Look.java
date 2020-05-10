package com.example.jdk.polymorphism;

public class Look {
	public void lookClient(Client client) {
		client.see();
	}

	public static void main(String[] args) {
		
		//此处Client就属于多态
		Client wy = new WangYi();
		Client xl = new XinLang();
		Client sh = new SouHu();
		
		//测试
		Look look = new Look();
		look.lookClient(wy);
		look.lookClient(xl);
		look.lookClient(sh);

	}
}

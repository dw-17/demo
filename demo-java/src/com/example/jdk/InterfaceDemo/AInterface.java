package com.example.jdk.InterfaceDemo;



public interface AInterface extends BInterface , CInterface {
	//接口可以用于多继承，中间只需要用","号隔开即可
	//接口的命名前要有interface关键字，接口的继承要用extends关键字
	void aFun();
}

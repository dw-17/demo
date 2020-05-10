package com.example.jdk.Singleton;
/**
 * 单例模式(定义:只能有产生一个对象)
 * 1、构造方法私有，通过静态方法创建并返回本类对象
 * 2、加判断，保证对象只有一份
 */
public class ChairMan {//创建一个ChairMan类
	//由于私有的private直接访问权限是本类，所以当需要具有很好的保护性时和安全性时，需要用private，防止别人通过别的类来更改本类的属性和方法
	private static ChairMan chairMan = null;//由于引用为静态的，所以对象将会共用一份拷贝
	
	private ChairMan() {
		//类外部无法实例化对象
	}
	
	public static ChairMan getChairMan() {
		if (chairMan == null) {//给予条件，使之能创建对象
			chairMan = new ChairMan();			
		}
		return chairMan;//返回本类ChairMan类型中的对象
	}
	
	public String name;//定义一个String类型的变量

}

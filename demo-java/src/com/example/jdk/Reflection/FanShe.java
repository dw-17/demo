package com.example.jdk.Reflection;
/*                                        *********Java中反射的基本知识********
 *1.反射通过对象操作属性和方法，即面向对象的编程思想
 *2.步骤:Class对象的创建-->(Constructors构造方法的选取)(如不选择表示为默认的无参构造方法)-->newInstance实例化对象-->调用属性Field和方法Method
 *3.属性Field中的set(obj,param)方法,前者为newInstance的实例兑现，后面为属性设置的参数
 *4.属性Method中的invoke(obj,param)方法,前者为newInstance的实例兑现，后面为方法中的参数
 *5.对于属性，方法，构造方法中有一个setAccessible()方法，表示访问权限是否被启用
 *6.field域、method方法和constructors构造方法中,凡是含有getDeclared..()方法，那么表示Class对象所表示的类和接口中的所有访问权限的属性和方法
 */
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FanShe {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SecurityException, NoSuchFieldException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		
//		//方法1(实例AAA类后直接调用相关的属性和方法,但是局限性为不能访问私有的属性和方法)
//		Class class1 = Class.forName("demo.reflect.AAA");
//		AAA aaa = (AAA)class1.newInstance();
//		aaa.setPassword("123");
//		System.out.println("密码为:" + aaa.getPassword());
//		aaa.fun1();
//		aaa.fun2();		
//		System.out.println(class1.getConstructors());
		
//		//方法2(真正的Java反射机制，哪怕是私有的属性和方法也可以逆向操作)
//		Class class1 = Class.forName("demo.reflect.AAA");
//		Field field = class1.getDeclaredField("username");
//		field.setAccessible(true);
//		Object aaa = class1.newInstance();
//		System.out.println(field);
//		field.set(aaa,"tom");
//		System.out.println("名字为：" + field.get(aaa));
		
		//方法3
		Class class1 = Class.forName("demo.reflect.AAA");
		Method method = class1.getDeclaredMethod("fun2");
		Object object = class1.newInstance();
		method.setAccessible(true);
		method.invoke(object);
	}
}

class AAA{
	
	public AAA(){
		System.out.println("我是默认无参构造器");
	}
	
	private String username;
	private String password;
	public void fun1(){
		System.out.println("我是fun1");
	}
	
	private void fun2(){
		System.out.println("我是fun2");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

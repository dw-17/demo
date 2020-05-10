package com.example.jdk.LamdbaExpression;
/**
 * Describe:This is about Lamdba Expression for JDK1.8
 * Note:1.函数式接口(FunctionalInterface)，只允许接口中有一个公共的抽象方法
 * 		2."()"--->表示参数，可以省略参数的类型，当里面仅有一个参数时，可以省略小括号
 * 		3."{}"--->表示方法体，当里面只有一个表达式/返回值/输出语句时，可以省略大括号
 * @author X
 *
 */
public class TestAnonymous {
	public static void main(String[] args) {
		//----------------------------Anonymous inner class----------------------------//
		//a
		Users usa = new Users(){
			@Override
			public void user(){
				System.out.println("无参数，无返回值");
			}
		};
		usa.user();
		
		//b
		Users1 usa1 = new Users1(){
			@Override
			public void user1(int a, String b){
				System.out.println("有参数，无返回值a : " + a + " and b : " + b);
			};
		};
		usa1.user1(2,"two");
		
		//c
		Users2 usa2 = new Users2(){
			@Override
			public int user2(int c){
				System.out.println("有参数，有返回值c : " + c);
				return c;
			};
		};
		usa2.user2(2);
		int result = usa2.user2(20);
		System.out.println("resultc : " + result);
		//----------------------------Anonymous inner class----------------------------//
		
		//----------------------------Lamdba expression----------------------------//
		//a
		Users usl = () -> {System.out.println("无参数，无返回值---复杂版");};
		usl.user();
		Users usla = () -> System.out.println("无参数，无返回值---简化版");
		usla.user();

		//b
		Users1 usl1 = (a,b) -> {
			System.out.println("有参数，无返回值---复杂版a : " + a);
			System.out.println("有参数，无返回值---复杂版b : " + b);
		};
		usl1.user1(3, "three");
		Users1 usl1a= (a,b) -> System.out.println("有参数，无返回值---简化版a: + " + a + " and b : " + b);
		usl1a.user1(4, "four");
		
		//c
		Users2 usl2 = (c) -> {
			System.out.println("有参数，有返回值---复杂版c : " + c);
			return c;
		};
		usl2.user2(10);
		int resulta = usl2.user2(10);
		System.out.println("resulta---复杂版c : " + resulta);
		
		
		Users2 usl2a = c-> {
			return c;
		};
		usl2a.user2(20);
		int resultb = usl2a.user2(20);
		System.out.println("resultb---进化版c : " + resultb);
		
		Users2 usl2b = c ->  c;
		int resultc = usl2b.user2(30);
		System.out.println("resultc---简化版c : " + resultc);
		//----------------------------Lamdba expression----------------------------//
	}
}

//a.无参数，无返回值函数式接口
@FunctionalInterface
interface Users{
	void user();
}

//b.有参数，无返回值函数式接口
@FunctionalInterface
interface Users1{
	void user1(int a, String b);
}

//c.有参数，有返回值函数式接口
@FunctionalInterface
interface Users2{
	int user2(int c);
}
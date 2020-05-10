package com.example.jdk.Test;

class Info<T> {
	private T content;

	public void setContent(T content) {
		this.content = content;
	}

	public T getContent() {
		return this.content;
	}
};

public class GenDemo01 {
	public static void main(String args[]){
		Info<Integer> info = new Info<Integer>() ;
		info.setContent(30) ;
		fun(info) ;
		}
		public static void fun(Info<?> temp){
		System.out.println(temp.getContent()) ;
		}
};

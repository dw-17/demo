package com.example.jdk.Test;

public class Student {
	public String name;
	
	public Student(){
		
	}
	
	public Student(String p){
		name = p;
	}
	
	public void changeName(Student p){
		this.name = p.name;
	}
}

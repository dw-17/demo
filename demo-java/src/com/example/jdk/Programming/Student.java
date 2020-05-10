package com.example.jdk.Programming;

public class Student extends Person implements Consumer{
	String school;
	
	public Student(String name ,String school) {
		super(name);
		this.school = school;
	}

	
	public void study(){
		 System.out.println(super.name + school + " 里学习");
	}

	@Override
	public void usecredit() {

	}
}

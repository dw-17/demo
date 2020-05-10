package com.example.bean;

public class User {
	private String name;
	private int num;
	private String job;
	private String sal;

	public User(String name, int num, String job, String sal) {
		this.name = name;
		this.num = num;
		this.job = job;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}
}

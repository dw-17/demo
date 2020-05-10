package com.example.springboot.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "grop")
public class ListConfig {
	private List<StudentInfo> studentList;

	public List<StudentInfo> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<StudentInfo> studentList) {
		this.studentList = studentList;
	}

	public static class StudentInfo {
		private String name;
		private String sex;
		private int age;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "当前对象的属性为：name=" + this.getName() + ", sex=" + this.getSex() + ", age=" + age;
		}
	}
}

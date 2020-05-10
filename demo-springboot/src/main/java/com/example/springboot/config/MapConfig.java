package com.example.springboot.config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "personal.person")
public class MapConfig {
	private Map<String, String> student;

	public Map<String, String> getStudent() {
		return student;
	}

	public void setStudent(Map<String, String> student) {
		this.student = student;
	}

}

package com.example.springboot.read_yml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.config.StudentProperty;

@RestController
public class AnnotationBeanTest {

	@Autowired
	private StudentProperty studentProperty;
	
	//此处返回值类型为一个对象实体StudentProperty，那么在页面会自动显示为json对象
	@RequestMapping(value = "/bean", method = RequestMethod.GET)
	public StudentProperty testConfigurationProperties() {
		return studentProperty;
	}
}

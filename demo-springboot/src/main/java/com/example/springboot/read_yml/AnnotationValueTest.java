package com.example.springboot.read_yml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnnotationValueTest {
	@Value("${name}")
	private String name;

	@Value("${sex}")
	private String sex;
	
	@Value("${age}")
	private int age;
	
	@Value("${combination}")
	private String combination;
	
	//注意，此处如果传入多个页面请求路径时，可以按照以下方式写入大括号内，eg：value={"/value", "testValue"}
	//web的默认提交方式为get请求，由于此时没有页面供给修改提交方式，所以此处必须写method=RequestMethod.GET,否则将会报错
	@RequestMapping(value={"/value", "testValue"}, method=RequestMethod.GET)
	public String testAnnotationValue(){
		String nameValue = name;
		String sexValue = sex;
		int ageValue = age;
		String combinationValue = combination;
		return "这是@Value注解的测试,测试结果为：nameValue=" + nameValue + ", sexValue=" + sexValue + ", ageValue=" + ageValue
				+ ", combinationValue=" + combinationValue;
	}
}

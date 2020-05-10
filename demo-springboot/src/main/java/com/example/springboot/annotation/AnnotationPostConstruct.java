package com.example.springboot.annotation;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.springboot.config.MapConfig;

@Component
public class AnnotationPostConstruct {
	private static Logger LOGGGER = LoggerFactory.getLogger(AnnotationPostConstruct.class);

	// Resource--->name，Autowired--->type
	@Resource(name = "mapConfig")
	private MapConfig mapConfig;
	
	@PostConstruct
	public void testPostConstruct() {
		Map<String, String> map = mapConfig.getStudent();
		LOGGGER.info("@PostConstruct用于启动springboot时初始化的方法，mapconfig的值--->name={},sex={},age={}", map.get("name"), map.get("sex"), map.get("age"));
	}
}

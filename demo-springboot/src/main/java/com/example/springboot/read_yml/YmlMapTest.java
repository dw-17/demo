package com.example.springboot.read_yml;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.config.MapConfig;

@RestController
public class YmlMapTest {
	@Resource
	private MapConfig mapConfig;

	@RequestMapping(value = "/map", method = RequestMethod.GET)
	public Map<String, String> testMap() {
		Map<String, String> map = mapConfig.getStudent();
		return map;
	}
}

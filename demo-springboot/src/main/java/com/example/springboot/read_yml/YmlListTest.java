package com.example.springboot.read_yml;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.config.ListConfig;
import com.example.springboot.config.ListConfig.StudentInfo;

@RestController
public class YmlListTest {
	@Resource
	private ListConfig listConfig;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<StudentInfo> listTest() {
		List<StudentInfo> list = listConfig.getStudentList();
		list.forEach(StudentInfo -> {
			System.out.println("遍历当前集合--->" + StudentInfo.toString());
		});
		return list;
	}
}

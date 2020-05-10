package com.example.springboot.control.rest;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.springboot.entity.User;

@RestController
public class ParseDataController {
	
	@RequestMapping(value="/json")
	public ModelAndView showDataController(){
		Map<String, List<User>> map = new HashMap<String, List<User>>();
		List<User> list = new LinkedList<User>();
		User user1 = new User();
		user1.setUsername("lilei");
		user1.setPassword("123");
		list.add(user1);
		User user2 = new User();
		user2.setUsername("zhenni");
		user2.setPassword("456");
		list.add(user2);
		map.put("A", list);
		List<User> list1 = new LinkedList<User>();
		User user3 = new User();
		user3.setUsername("mike");
		user3.setPassword("789");
		list1.add(user3);
		map.put("B", list1);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("parse");
		mav.addObject("dataJson", map);
		return mav;
	}
}

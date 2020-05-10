package com.example.springboot.control.rest;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ThymeleafController {
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public ModelAndView TLController() {
		List<String> list = new LinkedList<String>();
		list.add("name");
		list.add("age");
		list.add("sex");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("show");
		mav.addObject("dataList", list);
		return mav;
	}
}

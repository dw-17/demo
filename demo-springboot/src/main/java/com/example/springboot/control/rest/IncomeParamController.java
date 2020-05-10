package com.example.springboot.control.rest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.entity.User;
/**
 * 1.若前台表单的数据量比较大的时候，推荐使用Bean接受
 * 2.@PathVariable方式，指的是URL传递参数
 */
@RestController
public class IncomeParamController {
	//===========================简单接受=============================//
	@RequestMapping(value="/param1", method=RequestMethod.GET)
	public String param1Controller(String username, String password){
		return "第一种参数传递接受的方式：the data username is " + username + ", password is " + password;
	}
	
	//===========================@RequestParam接受=============================//
	@RequestMapping(value="/param2", method=RequestMethod.POST)
	public String param2Controller(@RequestParam(value="username") String un, @RequestParam String password){
		return "第二种参数传递接受的方式：the data username is " + un + ", password is " + password;
	}
	
	//===========================@PathVariable接受=============================//
	@RequestMapping(value="/param3/{username}/{password}", method=RequestMethod.POST)
	public String param3Controller(@PathVariable(value="username") String username, @PathVariable String password){
		return "第三种参数传递接受的方式：the data username is " + username + ", password is " + password;
	}
	
	//=========================HttpServletRequest接收===============================//
	@RequestMapping(value="/param4", method=RequestMethod.POST)
	public String param4Controller(HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		return "第四种参数传递接受的方式：the data username is " + username + ", password is " + password;
	}
	
	//==========================Bean接收==============================//
	@RequestMapping(value="/param5", method=RequestMethod.POST)
	public String param5Controller(User user){
		String username = user.getUsername();
		String password = user.getPassword();
		return "第五种参数传递接受的方式：the data username is " + username + ", password is " + password;
	}
}

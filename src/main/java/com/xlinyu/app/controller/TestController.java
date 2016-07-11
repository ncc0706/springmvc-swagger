package com.xlinyu.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.ApiOperation;
import com.xlinyu.model.User;

@Controller
@RequestMapping("/app/test")
public class TestController {

	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "根据用户名获取用户对象", httpMethod = "GET", response = User.class, notes = "根据用户名获取用户对象")
	public User getUser(){
		
		User user = new User();
		
		user.setId(1);
		user.setUsername("zhangsan");
		user.setPassword("abc123");
		return user;
		
	}
	
}

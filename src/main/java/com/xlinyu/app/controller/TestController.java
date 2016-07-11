package com.xlinyu.app.controller;

import java.util.ArrayList;
import java.util.List;

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
	@ApiOperation(value = "获取用户列表", httpMethod = "GET", response = List.class, notes = "获取用户列表")
	public List<User> getUser(){
		
		List<User> users = new ArrayList<User>();
		User u1 = new User();
		u1.setId(1);
		u1.setUsername("zhangsan");
		u1.setPassword("abc123");
		
		users.add(u1);
		
		u1 = new User();
		u1.setId(2);
		u1.setUsername("list");
		u1.setPassword("abc123");
		
		users.add(u1);
		
		
		return users;
		
	}
	
}

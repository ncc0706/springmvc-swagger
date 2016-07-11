package com.xlinyu.index.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
public class IndexController {

	private static final Logger logger = Logger.getLogger(IndexController.class);
	
	@RequestMapping(value={"/", "/home", "/index"})
	public String index(){
		logger.info("......... index page ........");
		return "index";
	}
	
}

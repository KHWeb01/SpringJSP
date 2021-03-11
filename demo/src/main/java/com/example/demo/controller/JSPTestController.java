package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Ctrl + Shift + O: 자동완성
@Controller
public class JSPTestController {
	private static final Logger log = 
			LoggerFactory.getLogger(JSPTestController.class);
	
	@GetMapping("/jsp")
	public String getJSP() {
		log.info("getJSP()");
		
		return "test";
	}
}

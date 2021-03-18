package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Member;

@Controller
@RequestMapping("/user")
public class MyBatisMemberController {
	
	private static final Logger log =
			LoggerFactory.getLogger(MyBatisMemberController.class);
	
	@GetMapping("/register")
	public void registerForm(Member member, Model model) 
			throws Exception {
		
		log.info("registerForm()");
	}
}

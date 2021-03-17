package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class MyBatisBoardController {
	
	private final static Logger log =
			LoggerFactory.getLogger(MyBatisBoardController.class);
	
	//@Autowired
	//private BoardService service;
	
	@GetMapping("/list")
	public void list(Model model) throws Exception {
		log.info("list()");
		
		//model.addAttribute("list", service.list());
	}
}

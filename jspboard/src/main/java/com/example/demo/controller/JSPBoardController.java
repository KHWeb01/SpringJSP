package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class JSPBoardController {
	
	private static final Logger log =
			LoggerFactory.getLogger(JSPBoardController.class);
	
	@GetMapping("/list")
	public void list(Model model) throws Exception {
		log.info("list()");
	}
}

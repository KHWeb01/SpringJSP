package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.MyBatisMember;

@Controller
@RequestMapping("/member")
public class MyBatisMemberController {
	
	private static final Logger log =
			LoggerFactory.getLogger(MyBatisMemberController.class);
			
	@GetMapping("/sign-up")
	public void getSignUpForm(MyBatisMember myBatisMember, Model model) throws Exception {

		log.info("GET signUpForm()");
	}
	
	@PostMapping("/sign-up")
	public String postSignUpForm(MyBatisMember member, Model model) throws Exception {
		log.info("POST signUpForm()");
		
		//service.register(member);
		
		model.addAttribute("msg", "등록이 성공적으로 완료되었습니다.");
		
		return "board/success";
	}
}

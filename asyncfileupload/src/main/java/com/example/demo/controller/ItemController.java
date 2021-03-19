package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
	
	private static final Logger log =
			LoggerFactory.getLogger(ItemController.class);
	
	@Autowired
	private ItemService itemService;
	
	@Value("${upload.path}")
	private String uploadPath;
	
	@GetMapping("/list")
	public void list(Model model) throws Exception {
		List<Item> itemList = itemService.list();
		
		model.addAttribute("itemList", itemList);
	}
	
	@GetMapping("/register")
	public String registerForm(Model model) {
		model.addAttribute(new Item());
		
		return "/item/register";
	}
}

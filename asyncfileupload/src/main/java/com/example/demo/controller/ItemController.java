package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;
import com.example.demo.util.UploadFileUtils;

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
	
	@PostMapping("/register")
	public String register(Item item, Model model) throws Exception {
		String[] files = item.getFiles();
		
		for(int i = 0; i < files.length; i++) {
			log.info("files[i] = " + files[i]);
		}
		
		//this.itemService.regist(item);
		
		model.addAttribute("msg", "성공적으로 상품이 등록되었습니다.");
		
		return "item/success";
	}
	
	@PostMapping(value = "/uploadAjax", produces = "text/plain; charset=UTF-8")
	public ResponseEntity<String> uploadAjax (MultipartFile file) throws Exception {
		
		log.info("원본 파일명: " + file.getOriginalFilename());
		
		// 유틸 라이브러리 작성 필요
		String savedName = UploadFileUtils.uploadFile(
				uploadPath, file.getOriginalFilename(), file.getBytes());
		
		return new ResponseEntity<String>(savedName, HttpStatus.CREATED);
	}
}

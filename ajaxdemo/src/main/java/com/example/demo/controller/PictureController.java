package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class PictureController {
	
	// Controller, RestController
	// json 데이터 파싱
	// DB 처리
	private static final Logger log =
			LoggerFactory.getLogger(PictureController.class);

	@GetMapping("/getPictureForm")
	public String getPictureForm () {
		log.info("getPictureForm()");
		
		return "getPictureForm";
	}
	
	@PostMapping("/postUploadAjax")
	public ResponseEntity<String> 
	postUploadAjax(MultipartFile file) throws Exception {

		String originalFilename = file.getOriginalFilename();
		
		log.info("originalName: " + originalFilename);
		
		ResponseEntity<String> entity = 
				new ResponseEntity<String>(
						"Upload 성공! " + originalFilename, HttpStatus.OK);
		
		return entity;
	}
}

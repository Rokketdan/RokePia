package com.example.rokepia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {

	//카테고리 테스트
	@GetMapping("/")
  public String home() {
		
		log.info("index 페이지 출력");
	  return "categories";
  }
	
	
}

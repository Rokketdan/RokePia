package com.example.rokepia.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.rokepia.model.LocationTest;
import com.example.rokepia.repository.TestMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class ContentsController {

	private final TestMapper test;
	
	//카테고리 테스트
	@GetMapping("/")
  public String home(Model model) {
		log.info("index 페이지 출력시작");
		
		List<LocationTest> humu = test.testAllSelect();
		model.addAttribute("testModel",humu);
		log.info("index 페이지 정성작동 함수종료");
	  return "categories";
  }
	@GetMapping("/a")
	  public String test() {
			
			log.info("index 페이지 출력");
		  return "anime-details";
	  }
	
}

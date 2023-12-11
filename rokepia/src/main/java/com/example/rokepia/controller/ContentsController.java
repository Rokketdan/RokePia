package com.example.rokepia.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.rokepia.model.Contents;
import com.example.rokepia.model.Location;
import com.example.rokepia.repository.TestMapper;
import com.example.rokepia.repository.TestMapper2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("contents")
public class ContentsController {

	private final TestMapper test;
	private final TestMapper2 test2;
	
	//카테고리 테스트
	@GetMapping("/")
  public String home(Model model) {
		log.info("index 페이지 출력시작");
		
		List<Location> humu = test.testAllSelect();
		model.addAttribute("testModel",humu);
		log.info("index 페이지 정성작동 함수종료");
	  return "categories";
  }
	@GetMapping("/a")
	  public String test() {
			
			log.info("index 페이지 출력");
		  return "anime-details";
	  }
	

	
	@GetMapping("anime")
	public String list(Model model) {
		List<Location> humu = test.testAllSelect();
		List<Contents> humu2 = test2.test2AllSelect();
		model.addAttribute("testModel",humu); //성지
		model.addAttribute("testModel2",humu2); //컨턴츠
		return "contents/anime";
	}

	
	@GetMapping("test")
	public String liat() {
		return "test";
	}
}

package com.example.rokepia.controller;

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

	//카테고리 테스트
	@GetMapping("anime")
	public String contents() {
	  return "contents/anime";
	}
	@GetMapping("contents_detail")
	public String contents_detail() {
			log.info("index 페이지 출력");
		  return "anime-details";
	  }
	
	@GetMapping("test")
	public String liat() {
		return "test";
	}
}

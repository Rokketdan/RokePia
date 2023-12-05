package com.example.rokepia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@RequestMapping("contents")
@Slf4j
public class ContentsController {
	
	@GetMapping("anime")
	public String list() {
		return "contents/anime";
	}
}

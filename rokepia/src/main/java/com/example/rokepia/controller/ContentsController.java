package com.example.rokepia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("contents")
public class ContentsController {
	
	@GetMapping("anime")
	public String list() {
		return "contents/anime";
	}
}

package com.example.rokepia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ContentsController {
	
	@GetMapping("contents")
	public String list() {
		return "contents/anime";
	}
}

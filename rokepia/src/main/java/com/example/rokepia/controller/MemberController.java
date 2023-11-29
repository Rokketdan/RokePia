package com.example.rokepia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@RequestMapping("member")
@Controller
@RequiredArgsConstructor
public class MemberController {
	
	@GetMapping("login")
	public String signUp() {
		return "member/login";
	}
}

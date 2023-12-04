package com.example.rokepia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HI {

	@GetMapping("travelwrite")
	public String travelwrite() {
		return "travelwrite";
	}
	
	@GetMapping("travel")
	public String travel() {
		return "travel";
	}
	
	@GetMapping("contact")
	public String contact() {
		return "contact";
	}
	
	@GetMapping("mypage")
	public String mypage() {
		return "mypage";
	}
	
	@GetMapping("freeboardwrite")
	public String freeboardwrite() {
		return "freeboardwrite";
	}
	
	
	@GetMapping("accounts")
	public String abc() {
		return "accounts";
	}
}

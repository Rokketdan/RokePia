package com.example.rokepia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HI {

	@GetMapping("contact")
	public String contact() {
		return "travel";
	}
}

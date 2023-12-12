package com.example.rokepia.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.rokepia.model.member.Member;
import com.example.rokepia.model.member.MemberLogin;
import com.example.rokepia.model.member.MemberSignup;
import com.example.rokepia.service.MemberService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("member")
@Controller
@RequiredArgsConstructor
public class MemberController {
	
	private final MemberService memberService;
	
	@GetMapping("signup")
	public String signUp(Model model) {
		model.addAttribute("member", new Member());
		return "member/signup";
	}
	
	@PostMapping("signup")
	public String signUp(@ModelAttribute("member") Member member, Model model) {
		
		// 회원가입 처리
		log.info("member:{}", member);
		
		memberService.saveMember(member);
		
		return "redirect:/";
	}
	
	
	@GetMapping("login")
	public String login(Model model) {
		model.addAttribute("login", new MemberLogin());
		return "member/login";
	}
	
	@PostMapping("login")
	public String login(@ModelAttribute("login") MemberLogin memberLogin, HttpServletRequest request,
						@RequestParam(defaultValue = "/") String redirectURL) {
		
		log.info("MemberLogin: {}", memberLogin);
		log.info("redirectURL: {}", redirectURL);
		
		Member findMember = memberService.findMember(memberLogin.getMember_email());
		
		HttpSession session = request.getSession();
		session.setAttribute("loginMember", findMember);
				
		return "redirect:" + redirectURL;
	}
}

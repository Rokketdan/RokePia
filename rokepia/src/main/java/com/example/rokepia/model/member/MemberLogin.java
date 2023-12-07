package com.example.rokepia.model.member;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class MemberLogin {
	@NotBlank(message = "아이디를 입력해주세요.")
	@Email(message = "이메일 주소를 정확히 입력해주세요.")
	private String member_email;
	@NotBlank(message = "비밀번호르 입력해주세요.")
	private String password;
}

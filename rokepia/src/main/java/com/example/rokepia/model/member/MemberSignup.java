package com.example.rokepia.model.member;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class MemberSignup {
	@NotBlank(message = "아이디를 입력해주세요.")
	@Email(message = "이메일 주소를 정확히 입력해주세요.")
	private String member_email;
	@NotBlank(message = "이름을 입력해주세요.")
	private String name;
	@NotBlank(message = "비밀번호를 입력해주세요.")
	@Length(min = 4, max = 20, message = "비밀번호는 4~20자 이내로 입력해주세요.")
	private String password;
	@NotEmpty(message = "성별을 선택해주세요.")
	private String gender;

	public static Member toMember(MemberSignup memberSignUp) {
		Member member = new Member();
		
		member.setMember_email(memberSignUp.getMember_email());
		member.setName(memberSignUp.getName());
		member.setPassword(memberSignUp.getPassword());
		
		return member;
	}
	
	

	
}

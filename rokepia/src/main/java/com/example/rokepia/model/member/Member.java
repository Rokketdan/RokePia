package com.example.rokepia.model.member;

import lombok.Data;

@Data
public class Member {

	private String member_email;
	private String name;
	private String password;
	private String profile;
	private GenderType gender;
}

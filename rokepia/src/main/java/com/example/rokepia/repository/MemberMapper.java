package com.example.rokepia.repository;


import org.apache.ibatis.annotations.Mapper;

import com.example.rokepia.model.Member;

@Mapper
public interface MemberMapper {
	Member findMember(String member_email); 
	void saveMember(Member member);
	 
	 
}

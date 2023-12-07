package com.example.rokepia.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.rokepia.model.member.Member;

@Mapper
public interface MemberMapper {
	void saveMember(Member member);

	Member findMember(String member_email);
}

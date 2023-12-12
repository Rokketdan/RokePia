package com.example.rokepia.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.rokepia.model.Member;
import com.example.rokepia.repository.MemberMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {
	
	private final MemberMapper memberMapper;
	
	public void saveMember(Member member) {
		memberMapper.saveMember(member);
	}
	
	public com.example.rokepia.model.Member findMember(String member_email) {
		
		Member findMember = memberMapper.findMember(member_email);
		
		return findMember;
	}
}

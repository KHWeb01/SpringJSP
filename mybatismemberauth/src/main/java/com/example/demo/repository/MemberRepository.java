package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Member;
import com.example.demo.entity.MemberAuth;

@Repository
public interface MemberRepository {
	
	public void create(Member member) throws Exception;
	
	public void createAuth(MemberAuth memberAuth) throws Exception;
	
	public Integer getno() throws Exception;
	
	//public Member read(Integer userNo) throws Exception;
}

package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.MyBatisMember;

@Repository
public interface MyBatisMemberRepository {
	
	public void signUp(MyBatisMember member) throws Exception;
}
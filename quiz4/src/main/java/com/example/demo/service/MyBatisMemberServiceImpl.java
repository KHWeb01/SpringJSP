package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MyBatisMember;
import com.example.demo.repository.MyBatisMemberRepository;

@Service
public class MyBatisMemberServiceImpl implements MyBatisMemberService {

	@Autowired
	private MyBatisMemberRepository repository;
	
	@Override
	public void signUp(MyBatisMember member) throws Exception {
		// TODO Auto-generated method stub
		repository.signUp(member);
	}
	
}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Board;
import com.example.demo.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardRepository repository;
	
	@Override
	public void register(Board board) throws Exception {
		// TODO Auto-generated method stub
		repository.create(board);
	}

	@Override
	public List<Board> list() throws Exception {
		// TODO Auto-generated method stub
		return repository.list();
	}
	
}

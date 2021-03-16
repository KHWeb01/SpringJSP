package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Board;

public interface BoardService {
	public void register(Board board) throws Exception;
	public List<Board> list() throws Exception;
}

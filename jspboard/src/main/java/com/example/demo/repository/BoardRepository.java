package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Board;

@Repository
public class BoardRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void create(Board board) throws Exception {
		String query = "insert into jspboard (board_no, title, content, writer) " +
						"values (jspboard_seq.nextval, ?, ?, ?)";
		
		jdbcTemplate.update(query, board.getTitle(), 
				board.getContent(), board.getWriter());
	}
}

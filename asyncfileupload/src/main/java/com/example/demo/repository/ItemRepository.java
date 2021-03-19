package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Item;

@Repository
public interface ItemRepository {
	
	public List<Item> list() throws Exception;
}

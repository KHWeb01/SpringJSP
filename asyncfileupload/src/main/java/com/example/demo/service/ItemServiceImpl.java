package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository repository; 
	
	@Override
	public List<Item> list() throws Exception {
		// TODO Auto-generated method stub
		return repository.list();
	}
}

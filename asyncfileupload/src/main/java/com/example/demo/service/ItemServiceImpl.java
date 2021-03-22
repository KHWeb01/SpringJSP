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

	@Override
	public void regist(Item item) throws Exception {
		// TODO Auto-generated method stub
		repository.create(item);
		
		String[] files = item.getFiles();
		
		if (files == null) {
			return;
		}
		
		for (String fileName : files) {
			repository.addAttach(fileName);
		}
	}

	@Override
	public Item read(Integer itemId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(Item item) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Integer itemId) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPicture(Integer itemId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAttach(Integer itemId) throws Exception {
		// TODO Auto-generated method stub
		return repository.getAttach(itemId);
	}
}

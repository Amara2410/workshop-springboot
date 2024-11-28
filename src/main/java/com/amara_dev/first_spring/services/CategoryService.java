package com.amara_dev.first_spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amara_dev.first_spring.entities.Category;
import com.amara_dev.first_spring.entities.Order;
import com.amara_dev.first_spring.repositories.CategoryRepository;

@Component
public class CategoryService {
	 
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();	
	}
	
	public Category findById(Long id) {
	Optional<Category> obj = repository.findById(id);
	return obj.get();
	}

}

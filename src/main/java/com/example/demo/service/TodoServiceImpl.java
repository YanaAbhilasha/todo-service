package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.ToDo;
import com.example.demo.repo.TodoRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class TodoServiceImpl implements TodoService{
	
	private TodoRepository todoRepository;

	@Override
	public void createTodo(ToDo todoservice) {
		// TODO Auto-generated method stub
		todoRepository.save(todoservice);
		
	}

	@Override
	public List<ToDo> getAllTodo() {
		// TODO Auto-generated method stub
		return todoRepository.findAll();
	}

	@Override
	public ToDo findById(Integer id) {
		// TODO Auto-generated method stub
		return todoRepository.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}

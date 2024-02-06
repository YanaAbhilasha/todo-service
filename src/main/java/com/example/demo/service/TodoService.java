package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ToDo;

public interface TodoService {
	void createTodo(ToDo todoservice);
	List<ToDo> getAllTodo();
	ToDo findById(Integer Id);
	void delete(Integer id);
}

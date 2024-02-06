package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ToDo;
import com.example.demo.service.TodoService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/todo")
@AllArgsConstructor
public class Controller {
	private TodoService todoService;
	@GetMapping
	public List<ToDo> getAllTodo(){
		return todoService.getAllTodo();
	}
	@PostMapping("/save")
	public void createTodo(@RequestBody ToDo todo) {
		todoService.createTodo(todo);
	}
	@DeleteMapping("/delete")
	public void delete(@RequestParam("id") Integer id) {
		todoService.delete(id);
	}

}


package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ToDo;



public interface TodoRepository extends JpaRepository<ToDo, Integer> {


}

package com.manojram.springboot.myfirstwebapplication.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRespoitory extends JpaRepository<Todo, Integer>{

	public List<Todo> findByUsername(String username);
}

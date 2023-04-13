package com.example.todo.service;

import com.example.todo.model.Todo;
import com.example.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;
    public List<Todo> getAllTasks(){
        return todoRepository.findAll();

    }

    public Todo saveTodo(Todo todo){
        return todoRepository.save(todo);
    }

    public Todo getTodoById(Long id){
        return todoRepository.findTodoById(id);
    }

    public Todo updateTodo(Todo todo){
        return todoRepository.save(todo);
    }

    public void deleteTodo(Todo todo){
        todoRepository.delete(todo);
    }


}

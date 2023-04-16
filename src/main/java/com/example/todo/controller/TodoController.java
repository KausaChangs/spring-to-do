package com.example.todo.controller;


import com.example.todo.model.Todo;
import com.example.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
;

@Controller
public class TodoController {

    @Autowired
    TodoService todoService;

    @RequestMapping("/todo")
    public String getTodos(){
        return "todos";
    }

    @RequestMapping("/showCreate")
    public String showCreate(){
    return "createTodo";
    }

    @RequestMapping("/saveTodo")
    public String createTodo(@ModelAttribute("task") Todo todo){
        todoService.saveTodo(todo);
        return "createTodo";
    }
}

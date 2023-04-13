package com.example.todo.controller;


import com.example.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
}

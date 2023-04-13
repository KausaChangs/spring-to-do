package com.example.todo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TodoController {

    @RequestMapping("/todo")
    public String getTodos(){
        return "todos";
    }
}

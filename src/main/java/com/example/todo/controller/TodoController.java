package com.example.todo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    @GetMapping("/todd")
    public String getTodos(){
        return "todos";
    }
}

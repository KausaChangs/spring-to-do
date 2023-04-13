package com.example.todo.model;

import jakarta.persistence.*;
import org.springframework.aot.generate.GeneratedTypeReference;

@Entity
@Table(name="todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @ManyToOne
    @JoinColumn(name="USER_ID")
    private User user;

    private String task;

    public Todo(){

    }

    public long getId(){return id;}

    public void setId(long id){this.id = id;}

    public Todo(String task, long id){
        this.task = task;
        this.id = id;
    }

    public User getUser(){
        return this.user;
    }

    public void setUser(User user){ this.user = user;}

    public String getTask(){
        return task;
    }

    public void setTask(String task){
        this.task =task;
    }

}

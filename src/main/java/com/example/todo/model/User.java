package com.example.todo.model;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;

    private String email;

    private String passWord;

    @OneToMany(mappedBy = "user")

    private Set<Todo>  todo = new HashSet<>();

    public Long getId(){ return id;}

    public void setId(Long id){this.id = id;}

    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
       this.userName = userName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassWord(){
        return passWord;
    }

    public void setPassWord(String passWord){
        this.passWord = passWord;
    }

    public Set<Todo> getTodo(){
        return todo;
    }

    public void setTodo(Set<Todo> todo){
        this.todo = todo;
    }

    @Override
    public String toString(){
        return userName;
    }




}

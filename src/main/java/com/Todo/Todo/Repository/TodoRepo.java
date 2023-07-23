package com.Todo.Todo.Repository;

import com.Todo.Todo.Model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class TodoRepo {
    @Autowired
    public List<Todo> todoList;




}

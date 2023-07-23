package com.Todo.Todo.Controller;

import com.Todo.Todo.Model.Todo;
import com.Todo.Todo.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TodoController {
    //add a todo
    @Autowired
    TodoService todoService;
    @PostMapping("todos")
    public String addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }
    @GetMapping("todos")
    public ArrayList<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }
    @GetMapping("allDoneTodos")
    public ArrayList<Todo> getAllDoneTodos(){
        return todoService.getAllDoneTodos();
    }
    @GetMapping("allUndoneTodos")
    public ArrayList<Todo> getAllUndoneTodos(){
        return todoService.getAllUndoneTodos();
    }

   @PutMapping("todo/todoId/{todoId}/todoStatus/{status}")
    public String updateTodoStatus(@PathVariable Integer todoId,@PathVariable boolean status){
        return todoService.updateTodoStatus(todoId,status);
    }

   @GetMapping("todos1/{string}")
    public String getSome(@PathVariable String string){
        return "Something "+string;
   }



}

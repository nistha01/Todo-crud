package com.Todo.Todo.Service;

import com.Todo.Todo.Model.Todo;
import com.Todo.Todo.Repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoService {
    @Autowired
    TodoRepo todoRepo;
    public String addTodo(Todo todo) {
      todoRepo.todoList.add(todo);
      return "Todo Added";
    }

    public ArrayList<Todo> getAllTodos() {
        return (ArrayList<Todo>) todoRepo.todoList;
    }

    public ArrayList<Todo> getAllDoneTodos() {
        ArrayList<Todo> doneList = new ArrayList<>();
        for(Todo todo : todoRepo.todoList){
            if(todo.isTodoDone()){
                doneList.add(todo);
            }
        }
        return doneList;
    }

    public ArrayList<Todo> getAllUndoneTodos() {
        ArrayList<Todo> undoneList = new ArrayList<>();
        for(Todo todo : todoRepo.todoList){
            if(!todo.isTodoDone()){
                undoneList.add(todo);
            }
        }
        return undoneList;
    }

    public String updateTodoStatus(Integer todoId,boolean status) {
        boolean flag = false;
       for(Todo todo : todoRepo.todoList){
           if(todo.getTodoId().equals(todoId)){
            todo.setTodoDone(status);
            flag = true;
         }
     }
     if(flag) return "Todo updated successfully ";
     else return "Invalid todoId "+ todoId;

    }
}

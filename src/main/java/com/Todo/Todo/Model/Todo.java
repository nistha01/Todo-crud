package com.Todo.Todo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    private Integer todoId;
    private String todoName;
    private boolean isTodoDone;



}

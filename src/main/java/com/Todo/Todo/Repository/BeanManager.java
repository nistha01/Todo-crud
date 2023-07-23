package com.Todo.Todo.Repository;

import com.Todo.Todo.Model.Todo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
@Configuration
public class BeanManager {
    @Bean
    public ArrayList<Todo> listBean(){
        return  new ArrayList<>();
    }
}

package com.demo.starting;

import com.demo.starting.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class todoservice {
    @Autowired
    private todorepository todorepo;
    public Todo create_todo(Todo todo){
        return todorepo.save(todo);
    }
    public Todo get_todo(Long id){
        return todorepo.findById(id).orElseThrow(
                ()->new RuntimeException("todo not found")
        );
    }

    public List<Todo> get_all_todo(){
        return todorepo.findAll();
    }
}

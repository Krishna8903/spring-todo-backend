package com.demo.starting;

import com.demo.starting.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {
    @Autowired
    private todoservice todoserv;
    @GetMapping("{id}")
    ResponseEntity<Todo> getuser(@PathVariable long id){
        try {
            Todo getuser=todoserv.get_todo(id);
            return new ResponseEntity<>(getuser, HttpStatus.OK);
        }
        catch(RuntimeException e){
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getall")
    ResponseEntity<List<Todo>>getalltodo(){
        return new ResponseEntity<List<Todo>>(todoserv.get_all_todo(),HttpStatus.OK);
    }

    @PostMapping("/create")
    ResponseEntity<Todo> createuser(@RequestBody Todo todo){

        return new ResponseEntity<>(todoserv.create_todo(todo), HttpStatus.CREATED);
    }




    @PostMapping()
    String pst(@RequestBody String body){
        return body;
    }
    @PutMapping()
    String ptm(@RequestBody String body){
        return body;
    }
    @DeleteMapping()
    String dtm(@RequestBody String body){
        return body;
    }
}

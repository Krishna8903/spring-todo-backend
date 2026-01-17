package com.demo.starting;

import com.demo.starting.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface todorepository extends JpaRepository<Todo, Long > {

}

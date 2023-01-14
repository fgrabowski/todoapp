package com.fgrabowski.springboot.simpletodoapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    static{
        todos.add(new Todo(1,"admin","Learn AWS", LocalDate.now().plusMonths(1), false));
        todos.add(new Todo(2,"admin","Learn Java", LocalDate.now().plusMonths(1), true));
        todos.add(new Todo(2,"admin","Learn Full Stack Development", LocalDate.now().plusMonths(1), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

}

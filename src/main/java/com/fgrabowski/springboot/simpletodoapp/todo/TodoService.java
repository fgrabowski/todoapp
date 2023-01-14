package com.fgrabowski.springboot.simpletodoapp.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {

    private static List<Todo> todos;

    static{
        todos.add(new Todo(1,"admin","Learn AWS", LocalDate.now().plusMonths(1), false));
        todos.add(new Todo(2,"admin","Learn Java", LocalDate.now().plusMonths(1), true));
        todos.add(new Todo(2,"admin","Learn Full Stack Development", LocalDate.now().plusMonths(1), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

}

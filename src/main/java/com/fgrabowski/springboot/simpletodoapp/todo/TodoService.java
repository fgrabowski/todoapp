package com.fgrabowski.springboot.simpletodoapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    private static int todosCount = 0;

    static {
        todos.add(new Todo(todosCount++,"admin","Learn AWS", LocalDate.now().plusMonths(1), false));
        todos.add(new Todo(todosCount++,"admin","Learn Java", LocalDate.now().plusMonths(1), true));
        todos.add(new Todo(todosCount++,"admin","Learn Full Stack Development", LocalDate.now().plusMonths(1), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(todosCount++,username,description,targetDate,done);
        todos.add(todo);
    }
}

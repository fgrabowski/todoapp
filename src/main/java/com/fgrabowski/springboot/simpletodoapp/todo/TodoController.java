package com.fgrabowski.springboot.simpletodoapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {

    TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    private TodoService todoService;

    // /list-todos
    @RequestMapping(value="/list-todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("admin");
        model.put("todos", todos);
        return "listTodos";
    }
}

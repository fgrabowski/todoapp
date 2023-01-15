package com.fgrabowski.springboot.simpletodoapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {

    TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    private TodoService todoService;
    @RequestMapping(value="/list-todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("admin");
        model.put("todos", todos);
        return "listTodos";
    }

    @RequestMapping(value="/add-todo", method = RequestMethod.GET)
    public String showAddTodoPage() {
        return "todo";
    }

    @RequestMapping(value="/add-todo", method = RequestMethod.POST)
    public String addTodoPage(@RequestParam String description, ModelMap model) {
        String username = (String) model.get("name");
        todoService.addTodo(username, description, LocalDate.now().plusMonths(1), false);
        return "redirect:list-todos";
    }
}

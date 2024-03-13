// Write your code here

package com.example.todo.repository;

import java.util.ArrayList;

import com.example.todo.model.Todo;

public interface TodoRepository {
    ArrayList<Todo> getAllTodos();

    Todo addTodo(Todo todo);

    Todo getTodo(int id);

    Todo updateTodo(int id, Todo todo);

    void deleteTodo(int id);
}
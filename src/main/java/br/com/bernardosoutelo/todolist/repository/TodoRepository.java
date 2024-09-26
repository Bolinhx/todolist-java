package br.com.bernardosoutelo.todolist.repository;

import br.com.bernardosoutelo.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}

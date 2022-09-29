package com.example.relationships.repository;

import com.example.relationships.model.one_to_one_inheritance.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepo extends CrudRepository<Task, Long> {
}

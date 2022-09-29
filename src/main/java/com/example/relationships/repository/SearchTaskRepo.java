package com.example.relationships.repository;

import com.example.relationships.model.one_to_one_inheritance.SearchTask;
import org.springframework.data.repository.CrudRepository;

public interface SearchTaskRepo extends CrudRepository<SearchTask, Long> {
}

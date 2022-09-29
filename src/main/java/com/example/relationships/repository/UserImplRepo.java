package com.example.relationships.repository;

import com.example.relationships.model.one_to_one.UserImpl;
import org.springframework.data.repository.CrudRepository;

public interface UserImplRepo extends CrudRepository<UserImpl, Long> {
}

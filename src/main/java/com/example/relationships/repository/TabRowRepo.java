package com.example.relationships.repository;

import com.example.relationships.model.many_to_one.TabRow;
import org.springframework.data.repository.CrudRepository;

public interface TabRowRepo extends CrudRepository<TabRow, Long> {
}

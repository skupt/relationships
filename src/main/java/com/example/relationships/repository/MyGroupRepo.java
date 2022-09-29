package com.example.relationships.repository;

import com.example.relationships.model.many_to_many.MyGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyGroupRepo extends CrudRepository<MyGroup, Long> {
}

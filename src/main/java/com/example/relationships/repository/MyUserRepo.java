package com.example.relationships.repository;

import com.example.relationships.model.many_to_many.MyUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserRepo extends CrudRepository<MyUser, Long> {
}

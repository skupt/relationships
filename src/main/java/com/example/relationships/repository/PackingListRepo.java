package com.example.relationships.repository;

import com.example.relationships.model.one_to_many.PackingList;
import org.springframework.data.repository.CrudRepository;

public interface PackingListRepo extends CrudRepository<PackingList, Long> {
}

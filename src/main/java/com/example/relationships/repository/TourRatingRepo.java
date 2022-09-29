package com.example.relationships.repository;

import com.example.relationships.model.many_to_many_composite_pk.TourRating;
import com.example.relationships.model.many_to_many_composite_pk.TourRatingPk;
import org.springframework.data.repository.CrudRepository;

public interface TourRatingRepo extends CrudRepository<TourRating, TourRatingPk> {
}

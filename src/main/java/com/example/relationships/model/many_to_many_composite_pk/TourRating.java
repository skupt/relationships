package com.example.relationships.model.many_to_many_composite_pk;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Data
@Entity
public class TourRating {

    @EmbeddedId
    private TourRatingPk pk;

    @Column(nullable = false)
    private Integer score;

    private String comment;
}

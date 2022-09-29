package com.example.relationships.model.many_to_many_composite_pk;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@Embeddable
public class TourRatingPk implements Serializable {
    @ManyToOne
    private Tour tour;

    @Column(insertable = false, updatable = false, nullable = false)
    private Integer customerId;

}

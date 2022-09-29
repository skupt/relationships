package com.example.relationships.model.many_to_many_composite_pk;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Tour {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private Integer price;
}
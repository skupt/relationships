package com.example.relationships.model.many_to_one;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String option;
}

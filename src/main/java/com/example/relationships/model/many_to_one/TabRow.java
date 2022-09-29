package com.example.relationships.model.many_to_one;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class TabRow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "choice_id")
    private Choice choice;
}

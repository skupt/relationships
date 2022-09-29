package com.example.relationships.model.one_to_one_inheritance;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public abstract class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private LocalDate startPoint;
    private LocalDate finishPoint;
    private int priority = 0;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "varchar(25) default 'NEW'")
    private TaskStatus taskStatus;
}

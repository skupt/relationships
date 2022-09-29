package com.example.relationships.model.one_to_many;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "packing_row")
public class PackingRow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private int amount;
    @ManyToOne
    @JoinColumn(name = "packingList")
//    @JsonIgnore
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PackingList packingList;
}

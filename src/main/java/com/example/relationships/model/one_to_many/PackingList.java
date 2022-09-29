package com.example.relationships.model.one_to_many;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "packing_list")
public class PackingList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private LocalDate localDate;
    private String buyer;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "packingList")
    List<PackingRow> packingRows;

}

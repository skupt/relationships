package com.example.relationships.model.many_to_many;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class MyGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "myGroups") //fetch = FetchType.EAGER,
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<MyUser> myUsers;
}

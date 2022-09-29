package com.example.relationships.model.many_to_many;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToMany //(fetch = FetchType.EAGER)
    @JoinTable(name = "my_user_my_group", joinColumns = @JoinColumn(name = "my_user_id"), inverseJoinColumns = @JoinColumn(name = "my_group_id"))
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<MyGroup> myGroups;
}

package com.example.relationships.model.one_to_one;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_impl", uniqueConstraints = @UniqueConstraint(columnNames = {"email"}))
public class UserImpl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @OneToOne(mappedBy = "userImpl", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private UserAccount userAccount;
}

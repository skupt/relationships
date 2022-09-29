package com.example.relationships.model.one_to_one;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_account")
public class UserAccount {
    @Id
    @Column(name = "user_id")
    private long id;
    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private UserImpl userImpl;
    @Column(name = "money_amount")
    private BigDecimal moneyAmount;
}

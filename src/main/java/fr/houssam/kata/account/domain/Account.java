package fr.houssam.kata.account.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by ghazala on 30/11/16.
 */
@Entity
@Data
@Builder
public class Account {

    @Id
    @GeneratedValue
    private final Long id;

    @NotNull
    private final String numero;

    private final long solde;

    @OneToOne(fetch = FetchType.LAZY)
    private final Customer customer;
}

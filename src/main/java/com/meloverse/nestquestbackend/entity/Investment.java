package com.meloverse.nestquestbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Investment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fk_client_id")
    private Long clientId;

    @Column(name = "fk_property_id")
    private Long propertyId;

    private Float downPayment;

    private Float loanAmount;

    private Float interestRate;

    private Integer loanTermYears;

    private Date purchaseDate;

    private Float closingCost;
}

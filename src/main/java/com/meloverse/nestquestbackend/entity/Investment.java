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
@Table(name = "property")
public class Investment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Float downPayment;
    private Float loanAmount;
    private Float interestRate;
    private Integer loanTermYears;
    private Date purchaseDate;
    private Float closingCost;
}

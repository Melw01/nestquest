package com.meloverse.nestquestbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "financial_metrics")
public class FinancialMetrics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Float cashFlow; // monthly cash flow
    private Float capRate; // capitalization rate
    private Float roi; // return on investment
    private Float cocRoi; // cash-on-cash return on investment
}

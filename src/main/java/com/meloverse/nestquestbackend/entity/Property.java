package com.meloverse.nestquestbackend.entity;

import com.meloverse.nestquestbackend.entity.enums.PropertyType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "property")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private Float purchasePrice;
    private PropertyType propertyType;
    private int squareFootage;
    private int bedrooms;
    private int bathrooms;
    private int yearBuilt;
    private List<Investment> investments;
    private List<RentalIncome> rentalIncomes;
    private List<Expense> expenses;
    private List<SaleInformation> saleInformationList;
    private List<FinancialMetrics> financialMetrics;
}

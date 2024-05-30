package com.meloverse.nestquestbackend.entity;

import com.meloverse.nestquestbackend.entity.enums.PropertyType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fk_client_id")
    private Long clientId;
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
}

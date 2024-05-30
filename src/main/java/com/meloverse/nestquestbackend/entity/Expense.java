package com.meloverse.nestquestbackend.entity;

import com.meloverse.nestquestbackend.entity.enums.ExpenseType;
import com.meloverse.nestquestbackend.entity.enums.Frequency;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "expense")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private ExpenseType expenseType;
    private Float amount;
    private Frequency frequency;
    private Boolean isRecurring;
}

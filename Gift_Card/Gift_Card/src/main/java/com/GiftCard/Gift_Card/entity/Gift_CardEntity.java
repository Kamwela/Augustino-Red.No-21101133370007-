package com.GiftCard.Gift_Card.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Gift_Card_table")
public class Gift_CardEntity {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)
    private Integer Value;
    @Column(nullable = false)
    private LocalDate Validate;
    @Column(nullable = false)
    private String Type;
    @Column(nullable = false)
    private String Activation_status;
    @Column(nullable = false)
    private String PaymentMode;
}

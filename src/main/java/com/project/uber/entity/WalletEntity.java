package com.project.uber.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "WALLET")
public class WalletEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UserEntity user;
    private Double balance;
    private List<PaymentEntity> payments;

}

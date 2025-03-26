package com.project.uber.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "WALLET")
public class WalletEntity {

    private Long id;
    private UserEntity user;
    private Double balance;
    private List<PaymentEntity> payments;

}

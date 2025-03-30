package com.project.uber.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WalletDto {
    private Long id;
    private UserDto user;
    private Double balance;
    private List<PaymentDto> payments = new ArrayList<>();
}

package com.project.uber.dto;

import com.project.uber.entity.RideEntity;
import com.project.uber.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PaymentDto {
    private Long id;
    private RideDto ride;
    private LocalDateTime paymentTime;
    private PaymentStatus status;
}

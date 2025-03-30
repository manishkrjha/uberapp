package com.project.uber.dto;

import com.project.uber.enums.PaymentMethod;
import com.project.uber.enums.RideStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RideDto {
    private Long id;
    private DriverDto driver;
    private RiderDto rider;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String otp;
    private Double fare;
    private Point pickupLocation;
    private Point dropLocation;
    private PaymentMethod paymentMethod;
    private RideStatus status;
}

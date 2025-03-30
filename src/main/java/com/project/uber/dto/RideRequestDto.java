package com.project.uber.dto;

import com.project.uber.enums.PaymentMethod;
import com.project.uber.enums.RideRequestStatus;
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
public class RideRequestDto {
    private Long id;
    private RiderDto rider;
    private LocalDateTime requestedTime;
    private Double fare;
    private Point pickupLocation;
    private Point dropLocation;
    private RideRequestStatus status;
    private PaymentMethod paymentMethod;
}

package com.project.uber.entity;

import com.project.uber.enums.PaymentMethod;
import com.project.uber.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Table(name = "RIDE")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RideEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private DriverEntity driver;
    private RiderEntity rider;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String otp;
    private Double fare;
    private Point pickupLocation;
    private Point dropLocation;

    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)
    private RideStatus status;
}

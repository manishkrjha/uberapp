package com.project.uber.entity;

import com.project.uber.enums.PaymentMethod;
import com.project.uber.enums.RideRequestStatus;
import jakarta.persistence.*;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Table(name = "RIDE_REQUEST")
public class RideRequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private RiderEntity rider;
    private LocalDateTime requestedTime;
    private Double fare;
    private Point pickupLocation;
    private Point dropLocation;

    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)
    private RideRequestStatus status;

    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
}

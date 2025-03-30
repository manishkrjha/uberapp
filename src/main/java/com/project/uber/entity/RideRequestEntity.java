package com.project.uber.entity;

import com.project.uber.enums.PaymentMethod;
import com.project.uber.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "RIDE_REQUEST")
public class RideRequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "rider_id")
    private RiderEntity rider;
    private LocalDateTime requestedTime;
    private Double fare;
    private Point pickupLocation;
    private Point dropLocation;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private RideRequestStatus status;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_method")
    private PaymentMethod paymentMethod;
}

package com.project.uber.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "RIDE_REQUEST")
public class RideRequestEntity {

    private Long id;
    private RiderEntity rider;
    private LocalDateTime requestedTime;
    private Double fare;

}

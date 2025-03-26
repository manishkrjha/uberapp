package com.project.uber.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "RIDE")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RideEntity {

    @Id
    private Long id;
    private DriverEntity driver;
    private RiderEntity rider;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String otp;
    private Double fare;

}

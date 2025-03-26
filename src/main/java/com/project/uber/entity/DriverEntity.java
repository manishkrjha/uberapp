package com.project.uber.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DRIVER")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DriverEntity {

    @Id
    private UserEntity user;

}

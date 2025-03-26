package com.project.uber.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "RIDER")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RiderEntity {

    @Id
    private UserEntity user;

}

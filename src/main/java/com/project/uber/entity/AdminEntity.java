package com.project.uber.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ADMIN")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AdminEntity {

    @Id
    private UserEntity user;

}

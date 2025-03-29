package com.project.uber.entity;

import com.project.uber.enums.RatingType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "RATING")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RatingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private RideEntity ride;
    private UserEntity user;

    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)
    private RatingType ratingType;

}

package com.project.uber.dto;

import com.project.uber.entity.RideEntity;
import com.project.uber.entity.UserEntity;
import com.project.uber.enums.RatingType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RatingDto {

    private Long id;
    private RideDto ride;
    private UserDto user;
    private RatingType ratingType;

}

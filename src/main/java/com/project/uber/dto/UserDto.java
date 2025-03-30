package com.project.uber.dto;

import com.project.uber.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Set<Roles> roles = new HashSet<>();
    private Point location;
    private WalletDto wallet;
}

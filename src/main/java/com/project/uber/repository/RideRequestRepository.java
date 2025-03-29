package com.project.uber.repository;

import com.project.uber.entity.RideRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequestEntity, Long> {
}

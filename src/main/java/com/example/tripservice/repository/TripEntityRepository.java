package com.example.tripservice.repository;

import com.example.tripservice.entity.TripEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface TripEntityRepository extends JpaRepository<TripEntity, UUID> {

}

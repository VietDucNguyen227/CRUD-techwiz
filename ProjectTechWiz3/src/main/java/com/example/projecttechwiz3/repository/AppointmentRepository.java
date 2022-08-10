package com.example.projecttechwiz3.repository;

import com.example.projecttechwiz3.model.AppointmentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<AppointmentStatus, Long> {
}

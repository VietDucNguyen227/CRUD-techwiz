package com.example.projecttechwiz3.repository;

import com.example.projecttechwiz3.model.MedicineDosages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineDosagesRepository extends JpaRepository<MedicineDosages, Long> {
}

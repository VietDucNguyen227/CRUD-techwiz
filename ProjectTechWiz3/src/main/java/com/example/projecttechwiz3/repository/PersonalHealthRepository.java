package com.example.projecttechwiz3.repository;

import com.example.projecttechwiz3.model.PersonalHealthVitals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalHealthRepository extends JpaRepository<PersonalHealthVitals, Long> {
}

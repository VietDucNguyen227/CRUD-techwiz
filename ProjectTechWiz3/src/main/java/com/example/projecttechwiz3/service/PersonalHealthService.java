package com.example.projecttechwiz3.service;

import com.example.projecttechwiz3.model.PersonalHealthVitals;

import java.util.List;
import java.util.Optional;

public interface PersonalHealthService {
    List<PersonalHealthVitals> getAllPersonalHealth();

    void savePersonalHealth(PersonalHealthVitals personalHealthVitals);

    void deletePersonalHealth(long id);

    Optional<PersonalHealthVitals> findPersonalHealthByID(long id);

    PersonalHealthVitals getOne(long id);
}

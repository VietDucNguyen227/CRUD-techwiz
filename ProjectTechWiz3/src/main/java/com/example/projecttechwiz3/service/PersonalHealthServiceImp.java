package com.example.projecttechwiz3.service;

import com.example.projecttechwiz3.model.PersonalHealthVitals;
import com.example.projecttechwiz3.repository.PersonalHealthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalHealthServiceImp implements PersonalHealthService{
    @Autowired
    PersonalHealthRepository personalHealthRepository;

    @Override
    public List<PersonalHealthVitals> getAllPersonalHealth() {
        return personalHealthRepository.findAll();
    }

    @Override
    public void savePersonalHealth(PersonalHealthVitals personalHealthVitals) {
        personalHealthRepository.save(personalHealthVitals);
    }

    @Override
    public void deletePersonalHealth(long id) {
        personalHealthRepository.deleteById(id);
    }

    @Override
    public Optional<PersonalHealthVitals> findPersonalHealthByID(long id) {
        return personalHealthRepository.findById(id);
    }

    @Override
    public PersonalHealthVitals getOne(long id) {
        return personalHealthRepository.findById(id).get();
    }
}

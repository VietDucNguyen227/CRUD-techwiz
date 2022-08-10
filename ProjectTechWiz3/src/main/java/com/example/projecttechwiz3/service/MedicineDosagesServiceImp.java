package com.example.projecttechwiz3.service;

import com.example.projecttechwiz3.model.MedicineDosages;
import com.example.projecttechwiz3.repository.MedicineDosagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicineDosagesServiceImp implements MedicineDosagesService {
    @Autowired
    MedicineDosagesRepository medicineDosagesRepository;

    @Override
    public List<MedicineDosages> getAllMedicine() {
        return medicineDosagesRepository.findAll();
    }

    @Override
    public void saveMedicine(MedicineDosages medicineDosages) {
        medicineDosagesRepository.save(medicineDosages);
    }

    @Override
    public void deleteMedicine(long dosagesId) {
        medicineDosagesRepository.deleteById(dosagesId);
    }

    @Override
    public Optional<MedicineDosages> findMedicineByID(long dosagesId) {
        return medicineDosagesRepository.findById(dosagesId);
    }

    @Override
    public MedicineDosages getOne(long dosagesId) {
        return medicineDosagesRepository.findById(dosagesId).get();
    }
}

package com.example.projecttechwiz3.service;

import com.example.projecttechwiz3.model.AppointmentStatus;
import com.example.projecttechwiz3.model.MedicineDosages;

import java.util.List;
import java.util.Optional;

public interface MedicineDosagesService {
    List<MedicineDosages> getAllMedicine();

    void saveMedicine(MedicineDosages medicineDosages);

    void deleteMedicine(long dosagesId);

    Optional<MedicineDosages> findMedicineByID(long dosagesId);

    MedicineDosages getOne(long dosagesId);
}

package com.example.projecttechwiz3.service;

import com.example.projecttechwiz3.model.AppointmentStatus;
import com.example.projecttechwiz3.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentStatusServiceImp implements AppointmentStatusService {
    @Autowired
    AppointmentRepository appointmentRepository;

    @Override
    public List<AppointmentStatus> getAllAppointment() {
        return appointmentRepository.findAll();
    }

    @Override
    public void saveAppointment(AppointmentStatus appointmentStatus) {
        appointmentRepository.save(appointmentStatus);
    }

    @Override
    public void deleteAppointment(long notificationId) {
        appointmentRepository.deleteById(notificationId);
    }

    @Override
    public Optional<AppointmentStatus> findAppointmentByID(long notificationId) {
        return appointmentRepository.findById(notificationId);
    }

    @Override
    public AppointmentStatus getOne(long notificationId) {
        return appointmentRepository.findById(notificationId).get();
    }
}

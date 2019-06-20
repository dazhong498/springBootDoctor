package com.dazhong.SpringBootAngularDoctor.services;

import com.dazhong.SpringBootAngularDoctor.models.Appointment;
import com.dazhong.SpringBootAngularDoctor.models.Doctor;
import com.dazhong.SpringBootAngularDoctor.models.Patient;
import com.dazhong.SpringBootAngularDoctor.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository repository;

    public void buildAppointment(Appointment appointment){
        repository.save(appointment);
    }

    public List<Appointment> getDoctorAppointments(Doctor doctor){
        return repository.findAllByDoctor(doctor);
    }

    public List<Appointment> getFreshAppointments(){
        return repository.findAllByPatientIsNullAndDoctorIsNotNull();
    }

    public void applyAppointment(Appointment appointment){
        repository.save(appointment);
    }

    public List<Appointment> getPatientAppointments(Patient patient){
        return repository.findAllByPatient(patient);
    }

    public List<Appointment> getAllAppointments(){
        return repository.findAllByPatientIsNotNull();
    }

    public void removeByDoctor(Doctor doctor){
        repository.removeByDoctor(doctor);
    }
}

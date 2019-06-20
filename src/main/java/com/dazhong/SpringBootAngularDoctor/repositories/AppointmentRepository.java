package com.dazhong.SpringBootAngularDoctor.repositories;

import com.dazhong.SpringBootAngularDoctor.models.Appointment;
import com.dazhong.SpringBootAngularDoctor.models.Doctor;
import com.dazhong.SpringBootAngularDoctor.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

    List<Appointment> findAllByDoctor(Doctor doctor);

    List<Appointment> findAllByPatientIsNullAndDoctorIsNotNull();

    List<Appointment> findAllByPatient(Patient patient);

    List<Appointment> findAllByPatientIsNotNull();

    @Transactional
    void removeByDoctor(Doctor doctor);
}

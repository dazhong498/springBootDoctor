package com.dazhong.SpringBootAngularDoctor.repositories;

import com.dazhong.SpringBootAngularDoctor.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

    Patient findByUserNameAndPassword(String userName, String password);

    Patient findById(int id);
}

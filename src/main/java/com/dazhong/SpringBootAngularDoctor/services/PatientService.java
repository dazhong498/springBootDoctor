package com.dazhong.SpringBootAngularDoctor.services;

import com.dazhong.SpringBootAngularDoctor.models.Patient;
import com.dazhong.SpringBootAngularDoctor.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepository repository;

    public void signUp(Patient patient){
        repository.save(patient);
    }

    public Patient patientLogin(String userName, String password){
        return repository.findByUserNameAndPassword(userName, password);
    }

    public Patient editProfile(Patient patient){
        repository.save(patient);
        return repository.findById(patient.getId());
    }
}

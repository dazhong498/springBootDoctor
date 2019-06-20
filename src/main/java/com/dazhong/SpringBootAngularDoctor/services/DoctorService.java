package com.dazhong.SpringBootAngularDoctor.services;

import com.dazhong.SpringBootAngularDoctor.models.Doctor;
import com.dazhong.SpringBootAngularDoctor.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repository;

    public void addDoctor(Doctor doctor){
        repository.save(doctor);
    }

    public Doctor doctorLogin(String userName, String password){
        return repository.findByUserNameAndPassword(userName, password);
    }

    public Doctor editProfile(Doctor doctor){
        repository.save(doctor);
        return repository.findById(doctor.getId());
    }

    public List<Doctor> getAllDoctor(){
        return repository.findAll();
    }

    public void removeDoctorById(Doctor doctor){
        repository.removeById(doctor.getId());
    }
}

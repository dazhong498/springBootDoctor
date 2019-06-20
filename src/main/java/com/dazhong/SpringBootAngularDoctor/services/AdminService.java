package com.dazhong.SpringBootAngularDoctor.services;

import com.dazhong.SpringBootAngularDoctor.models.Admin;
import com.dazhong.SpringBootAngularDoctor.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository repository;

    public void adminSignUp(Admin admin){
        repository.save(admin);
    }

    public Admin adminLogin(String userName, String password){
        return repository.findByUserNameAndPassword(userName, password);
    }
}

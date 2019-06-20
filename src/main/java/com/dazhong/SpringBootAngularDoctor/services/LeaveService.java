package com.dazhong.SpringBootAngularDoctor.services;

import com.dazhong.SpringBootAngularDoctor.models.Leave;
import com.dazhong.SpringBootAngularDoctor.repositories.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaveService {
    @Autowired
    private LeaveRepository repository;

    public void applyLeave(Leave leave){
        repository.save(leave);
    }
}

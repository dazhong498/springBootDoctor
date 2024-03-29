package com.dazhong.SpringBootAngularDoctor.repositories;

import com.dazhong.SpringBootAngularDoctor.models.Leave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveRepository extends JpaRepository<Leave, Integer> {
}

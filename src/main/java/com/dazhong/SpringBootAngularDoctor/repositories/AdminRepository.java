package com.dazhong.SpringBootAngularDoctor.repositories;

import com.dazhong.SpringBootAngularDoctor.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    public Admin findByUserNameAndPassword(String userName, String password);
}

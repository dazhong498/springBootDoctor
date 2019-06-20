package com.dazhong.SpringBootAngularDoctor.repositories;

import com.dazhong.SpringBootAngularDoctor.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

    public Doctor findByUserNameAndPassword(String userName, String password);

    public Doctor findById(int id);

    @Transactional
    public void removeById(int id);
}

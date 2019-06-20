package com.dazhong.SpringBootAngularDoctor.controllers;

import com.dazhong.SpringBootAngularDoctor.models.Appointment;
import com.dazhong.SpringBootAngularDoctor.models.Doctor;
import com.dazhong.SpringBootAngularDoctor.models.Patient;
import com.dazhong.SpringBootAngularDoctor.services.AdminService;
import com.dazhong.SpringBootAngularDoctor.services.AppointmentService;
import com.dazhong.SpringBootAngularDoctor.services.DoctorService;
import com.dazhong.SpringBootAngularDoctor.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {

//    @Autowired
//    private PatientService patientService;

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private AppointmentService appointmentService;

//    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
//    public void patientSignUp(@RequestParam("userName") String userName, @RequestParam("password") String password){
//        patientService.signUp(new Patient(userName, password));
//    }

    @RequestMapping(value = "/loginDoctor", method = RequestMethod.POST)
    public Doctor loginDoctor(@RequestParam("userName")String userName, @RequestParam("password") String password){
        return doctorService.doctorLogin(userName, password);
    }


    @RequestMapping(value = "/editProfileDoctor", method = RequestMethod.POST)
    public Doctor edit(@Valid @RequestBody Doctor doctor){
        return doctorService.editProfile(doctor);
    }

    @RequestMapping(value = "/getAllDoctors", method = RequestMethod.POST)
    public List<Doctor> getAllDoctors(){
        return doctorService.getAllDoctor();
    }

    @RequestMapping(value = "/addDoctor", method = RequestMethod.POST)
    public void addDoctor(@RequestBody Doctor doctor){
        doctorService.addDoctor(doctor);
    }

    @RequestMapping(value = "/removeDoctor", method = RequestMethod.POST)
    public void removeDoctor(@RequestBody Doctor doctor){
        System.out.println("Remove"  + doctor);
        appointmentService.removeByDoctor(doctor);
        doctorService.removeDoctorById(doctor);
    }
}

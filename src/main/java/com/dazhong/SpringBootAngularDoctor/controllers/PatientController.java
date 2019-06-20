package com.dazhong.SpringBootAngularDoctor.controllers;

import com.dazhong.SpringBootAngularDoctor.models.Patient;
import com.dazhong.SpringBootAngularDoctor.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @RequestMapping(value = "/loginPatient", method = RequestMethod.POST)
    public Patient loginPatient(@RequestParam("userName")String userName, @RequestParam("password") String password){
        return patientService.patientLogin(userName, password);
    }

    @RequestMapping(value = "/editProfilePatient", method = RequestMethod.POST)
    public Patient edit(@Valid @RequestBody Patient patient){
        System.out.println(patient);
        return patientService.editProfile(patient);
    }

    @RequestMapping(value = "/signUpPatient", method = RequestMethod.POST)
    public Patient patientSignUp(@RequestBody Patient patient){
        patientService.signUp(patient);
        return patient;
    }
}

package com.dazhong.SpringBootAngularDoctor.controllers;

import com.dazhong.SpringBootAngularDoctor.models.Appointment;
import com.dazhong.SpringBootAngularDoctor.models.Doctor;
import com.dazhong.SpringBootAngularDoctor.models.Patient;
import com.dazhong.SpringBootAngularDoctor.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;


    @RequestMapping(value = "/buildAppointment", method = RequestMethod.POST)
    public Appointment buildAppointment(@RequestBody Appointment appointment){
        appointmentService.buildAppointment(appointment);
        return appointment;
    }

    @RequestMapping(value = "/getDoctorAppointment", method = RequestMethod.POST)
    public List<Appointment> getAppointments(@RequestBody Doctor doctor){
        return appointmentService.getDoctorAppointments(doctor);
    }

    @RequestMapping(value = "/getFreshAppointments", method = RequestMethod.POST)
    public List<Appointment> getFreshAppointments(){
        return appointmentService.getFreshAppointments();
    }

    @RequestMapping(value = "/applyAppointment", method = RequestMethod.POST)
    public void applyAppointment(@RequestBody Appointment appointment){
        System.out.println(appointment);
        appointmentService.applyAppointment(appointment);
    }

    @RequestMapping(value = "/getPatientAppointment", method = RequestMethod.POST)
    public List<Appointment> getPatientAppointments(@RequestBody Patient patient){
        return appointmentService.getPatientAppointments(patient);
    }

    @RequestMapping(value = "/getAllAppointments", method = RequestMethod.POST)
    public List<Appointment> getAllAppointments(){
        return appointmentService.getAllAppointments();
    }
}

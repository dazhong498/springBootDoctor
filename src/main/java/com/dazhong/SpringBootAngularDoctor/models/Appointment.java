package com.dazhong.SpringBootAngularDoctor.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate date;
    private String period;
    @ManyToOne
    private Doctor doctor;
    @ManyToOne
    private Patient patient;

    public Appointment() {
    }

    public Appointment(LocalDate date, String period, Doctor doctor, Patient patient) {
        this.date = date;
        this.period = period;
        this.doctor = doctor;
        this.patient = patient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", date=" + date +
                ", period='" + period + '\'' +
                ", doctor=" + doctor +
                ", patient=" + patient +
                '}';
    }
}

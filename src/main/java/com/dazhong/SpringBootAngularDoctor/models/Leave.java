package com.dazhong.SpringBootAngularDoctor.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    private String reason;
    @OneToOne
    private Doctor doctor;
    private String status;


    public Leave() {
    }

    public Leave(Date date, String reason, Doctor doctor, String status) {
        this.date = date;
        this.reason = reason;
        this.doctor = doctor;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "id=" + id +
                ", date=" + date +
                ", reason='" + reason + '\'' +
                ", doctor=" + doctor +
                ", status='" + status + '\'' +
                '}';
    }
}

package com.hms.hospitalManagementSystem.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter


@Entity
public class Appointments extends BaseModel{

    private String UID;
    private String patientNmae;
    private Integer patientAge;
    private  String sufferingFrom;
    private String mobileNo;
    private String email;
    private  String Gender;
    private String guardianName;
    private String address;
    private LocalDate dob;
    private int isInsuranceAvailable;
    private LocalDate appointmentdate;


    @ManyToOne
    private  Doctor doctor;
    @ManyToOne
    private User user;
}

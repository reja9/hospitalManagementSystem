package com.hms.hospitalManagementSystem.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class AppointsmentsAvailability extends  BaseModel{

    private Long doctorId;
    private LocalDate date;
    private int totalPatientVisit;
}

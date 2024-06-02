package com.hms.hospitalManagementSystem.Services;

import com.hms.hospitalManagementSystem.Models.Appointments;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentService {

    public List<LocalDate> getAppointmentDate(Long doctorId);

    public String saveAppointment(Appointments appointments);
}

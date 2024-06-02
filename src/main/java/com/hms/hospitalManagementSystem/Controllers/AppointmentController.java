package com.hms.hospitalManagementSystem.Controllers;

import com.hms.hospitalManagementSystem.Models.Appointments;
import com.hms.hospitalManagementSystem.Services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(value = "/appointment")

public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;
    @GetMapping(value = "/getAppointmentDate/{doctorId}")
    public ResponseEntity<List<LocalDate>> getAppointmentDate(@PathVariable("doctorId") Long doctorId){
        List<LocalDate> allAvailableDate=appointmentService.getAppointmentDate(doctorId);
        return ResponseEntity.ok(allAvailableDate);
    }

    @PostMapping(value = "/saveAppointment")
    public ResponseEntity<String> saveAppointment(@RequestBody Appointments appointment){
        String resp=appointmentService.saveAppointment(appointment);
        return ResponseEntity.ok(resp);
    }
}

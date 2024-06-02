package com.hms.hospitalManagementSystem.Services;

import com.hms.hospitalManagementSystem.Models.Appointments;
import com.hms.hospitalManagementSystem.Models.AppointsmentsAvailability;
import com.hms.hospitalManagementSystem.Repositories.AppointmentAvailableRepo;
import com.hms.hospitalManagementSystem.Repositories.AppointmentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    private AppointmentAvailableRepo appointmentAvailableRepo;
    @Autowired
    private AppointmentsRepo appointmentsRepo;

    @Value("${hospital.code}")
    String hospitalCode;
    @Override
    public List<LocalDate> getAppointmentDate(Long doctorId) {

        List<AppointsmentsAvailability> getAllAppointment=appointmentAvailableRepo.findByDoctorId(doctorId);
        List<LocalDate> getAllDate= (List<LocalDate>) getAllAppointment.stream().map(a -> a.getDate()).collect(Collectors.toList());
        return getAllDate;
    }

    @Override
    public String saveAppointment(Appointments appointments) {

        StringBuilder sb= new StringBuilder();
        sb.append(hospitalCode);
        sb.append(LocalDate.now().toString().replace("-", ""));
        Random random=new Random();
        String id = String.format("%04d", random.nextInt(10000));
        sb.append(id);
        appointments.setUID(sb.toString());
        appointmentsRepo.save(appointments);
        return "Appointment is craeted";
    }
}

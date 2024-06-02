package com.hms.hospitalManagementSystem.Repositories;

import com.hms.hospitalManagementSystem.Models.AppointsmentsAvailability;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentAvailableRepo extends JpaRepository<AppointsmentsAvailability, Long> {

    public List<AppointsmentsAvailability> findByDoctorId(Long doctorId);
}

package com.hms.hospitalManagementSystem.Repositories;

import com.hms.hospitalManagementSystem.Models.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentsRepo extends JpaRepository<Appointments, Long> {
}

package com.hms.hospitalManagementSystem.Repositories;

import com.hms.hospitalManagementSystem.Models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DoctorRepo extends JpaRepository<Doctor, Long> {

    List<Doctor> findByDepartmentId(Long deptId);
}

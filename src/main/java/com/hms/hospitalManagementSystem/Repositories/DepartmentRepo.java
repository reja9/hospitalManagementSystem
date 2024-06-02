package com.hms.hospitalManagementSystem.Repositories;

import com.hms.hospitalManagementSystem.Models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

}

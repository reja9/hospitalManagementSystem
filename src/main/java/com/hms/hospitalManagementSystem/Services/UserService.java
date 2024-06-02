package com.hms.hospitalManagementSystem.Services;


import com.hms.hospitalManagementSystem.Models.Department;
import com.hms.hospitalManagementSystem.Models.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public List<Department> getAllDept();

    public  List<Doctor> getDoctorByDept(Long deptId);

}

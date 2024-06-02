package com.hms.hospitalManagementSystem.Services;

import com.hms.hospitalManagementSystem.Exceptions.DoctorNotFoundException;
import com.hms.hospitalManagementSystem.Models.Department;
import com.hms.hospitalManagementSystem.Models.Doctor;
import com.hms.hospitalManagementSystem.Models.User;
import com.hms.hospitalManagementSystem.Repositories.DepartmentRepo;
import com.hms.hospitalManagementSystem.Repositories.DoctorRepo;
import com.hms.hospitalManagementSystem.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;
    @Autowired
    DepartmentRepo departmentRepo;
    @Autowired
    DoctorRepo doctorRepo;
    @Override
    public List<Department> getAllDept() {
        List<Department> deptList= departmentRepo.findAll();
        return deptList;
    }

    @Override
    public List<Doctor> getDoctorByDept(Long deptId) {
        List<Doctor> doctorList=doctorRepo.findByDepartmentId(deptId);
        boolean b= doctorList.isEmpty();
        if(b){
            throw new DoctorNotFoundException("Doctor of deptId : "+deptId+"---- Not Found");
        }
        return doctorList;
    }
}

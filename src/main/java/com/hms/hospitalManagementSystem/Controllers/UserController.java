package com.hms.hospitalManagementSystem.Controllers;


import com.hms.hospitalManagementSystem.Models.Department;
import com.hms.hospitalManagementSystem.Models.Doctor;
import com.hms.hospitalManagementSystem.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping(value = "/allDepartment")
    public ResponseEntity<List<Department>> getAllDept(){
        List<Department> allDept= userService.getAllDept();
        return ResponseEntity.ok(allDept);
    }

    @GetMapping(value = "/doctor/{deptId}")
    public ResponseEntity<List<Doctor>> getDoctorByDept(@PathVariable ("deptId") Long deptId){

        List<Doctor> doctorList=userService.getDoctorByDept(deptId);
        return ResponseEntity.ok(doctorList);

    }
}

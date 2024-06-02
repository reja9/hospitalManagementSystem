package com.hms.hospitalManagementSystem.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Department extends BaseModel{

    private  String deptName;
    private  String deptCode;
    private String deptDesc;
}

package com.hms.hospitalManagementSystem.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "hms_user")
public class User extends  BaseModel{

    private String name;
    private  String mobileNo;
    private String email;
    private  String password;
}

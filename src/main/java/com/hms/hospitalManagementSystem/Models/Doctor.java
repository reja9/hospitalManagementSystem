package com.hms.hospitalManagementSystem.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter

@Entity
public class Doctor extends BaseModel  {

    private  String name;
    private String profilePhotoPat;
    private Long yearOfPassing;
    private  String docDesc;
    @ManyToOne

    private  Department department;
}

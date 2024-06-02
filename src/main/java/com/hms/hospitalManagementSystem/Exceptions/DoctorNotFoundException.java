package com.hms.hospitalManagementSystem.Exceptions;

public class DoctorNotFoundException extends RuntimeException{


    public DoctorNotFoundException(String message){
        super((message));
    }

}

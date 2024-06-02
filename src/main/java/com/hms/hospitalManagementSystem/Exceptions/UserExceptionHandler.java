package com.hms.hospitalManagementSystem.Exceptions;

import com.hms.hospitalManagementSystem.Controllers.UserController;
import com.hms.hospitalManagementSystem.DTOs.ExceptionResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackageClasses = UserController.class)
public class UserExceptionHandler {

    @ExceptionHandler(DoctorNotFoundException.class)
    public ResponseEntity handleDoctorNotFoundException(DoctorNotFoundException pe){
        ExceptionResponseDto exceptionResponseDto=new ExceptionResponseDto(pe.getMessage(), 404);
        return new ResponseEntity<>(exceptionResponseDto, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(RandomException.class)
    public  ResponseEntity handleRandomException(RandomException pe){
        ExceptionResponseDto exceptionResponseDto=new ExceptionResponseDto(pe.getMessage(),404);
        return  new ResponseEntity<>(exceptionResponseDto,HttpStatus.NOT_FOUND);
    }
}

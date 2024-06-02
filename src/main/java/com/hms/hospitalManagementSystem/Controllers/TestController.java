package com.hms.hospitalManagementSystem.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/test")
    private String test(){
        return " I Am Reja";
    }
}

package com.example.SpringBootKafkaDemo.TestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
@RestController
public class Test {

    @GetMapping("status")
    public String getStatus(){

        return "Server is up and running";
    }
}

package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan({"com.api.parkingcontrol", "com.api.parkingcontrol.controllers"})
public class ParkingControlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParkingControlApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "Olá Mundo!!!";
    }

}

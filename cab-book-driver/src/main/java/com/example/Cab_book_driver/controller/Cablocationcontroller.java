package com.example.Cab_book_driver.controller;

import com.example.Cab_book_driver.service.Cablocationservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class Cablocationcontroller {

    @Autowired
    Cablocationservice cls;

    @PutMapping("/location")
    public ResponseEntity<?> updatelocation() throws InterruptedException {
        int range = 100;

        while (range > 0) {
            String location = Math.random() + "," + Math.random();
            cls.updatelocation(location);
            Thread.sleep(1000);
            range--;
        }
        return new ResponseEntity<>(Map.of("message", "location updated"),
                HttpStatus.OK);
    }
}

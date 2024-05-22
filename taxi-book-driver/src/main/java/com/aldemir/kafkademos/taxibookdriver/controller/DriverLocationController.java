package com.aldemir.kafkademos.taxibookdriver.controller;

import com.aldemir.kafkademos.taxibookdriver.service.DriverLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class DriverLocationController {

    private final DriverLocationService driverLocationService;

    public DriverLocationController(DriverLocationService driverLocationService) {
        this.driverLocationService = driverLocationService;
    }


    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {


        int range = 100;
        while (range > 0) {
            driverLocationService.updateLocation(Math.random() + "," +Math.random()); //act as lat, long
            Thread.sleep(1000);
            range--;
        }

        return new ResponseEntity<>(Map.of("message", "Location updated"), HttpStatus.OK);
    }
}

package com.aldemir.kafkademos.taxibookpassenger.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "driver-location", groupId = "passenger-group")
    public void driverLocation(String location){
        System.out.println(location);
    }
}

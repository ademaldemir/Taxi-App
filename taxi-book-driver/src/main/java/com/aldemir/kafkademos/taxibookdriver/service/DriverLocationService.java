package com.aldemir.kafkademos.taxibookdriver.service;

import com.aldemir.kafkademos.taxibookdriver.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DriverLocationService {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean updateLocation(String location) {
        kafkaTemplate.send(AppConstant.DRIVER_LOCATION, location);
        return true;
    }

}

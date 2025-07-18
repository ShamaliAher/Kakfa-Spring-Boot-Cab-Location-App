package com.shamalicode.cab_book_driver.service;


import com.shamalicode.cab_book_driver.constants.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public boolean booleanUpdateLocation(String location)
    {
        kafkaTemplate.send(AppConstant.CAB_LOCATION,location);
        return true;

    }
}

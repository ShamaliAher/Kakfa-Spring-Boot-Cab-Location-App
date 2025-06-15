package com.shamalicode.cab_book_driver.controller;


import com.shamalicode.cab_book_driver.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {

    @Autowired
    private CabLocationService cabLocationService;

    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {
        int num=100;
        while(num>0)
        {
            Thread.sleep(1000);
            cabLocationService.booleanUpdateLocation(Math.random()+" , "+Math.random());
            num--;
        }
        return new ResponseEntity<>(Map.of("Message","Location updated"), HttpStatus.OK);
    }
}

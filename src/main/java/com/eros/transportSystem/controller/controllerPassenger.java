package com.eros.transportSystem.controller;
import com.eros.transportSystem.repository.Passenger;
import com.eros.transportSystem.service.Passenger.IServicePassenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/pasajeros")
@RestController
public class controllerPassenger {

    @Autowired
    private IServicePassenger servicePassenger;

    @GetMapping
    public  ResponseEntity<List<Passenger>> getAllDestination(){
        List<Passenger> result = servicePassenger.getAllPassenger();
        return ResponseEntity.ok(result);
    };
}

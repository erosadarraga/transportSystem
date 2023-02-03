package com.eros.transportSystem.controller;

import com.eros.transportSystem.repository.Destination;
import com.eros.transportSystem.service.Destination.IServiceDestination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping("api/destinos")
@RestController
public class controllerDestination {

    @Autowired
    private IServiceDestination serviceDestination;

    @GetMapping
    public ResponseEntity<List<Destination>> getAllDestination(){
        List<Destination> result = serviceDestination.getAllDestination();
        return ResponseEntity.ok(result);
    };

    @PostMapping
    public ResponseEntity<Destination> getAllDestination(@RequestBody Destination destination){
        Destination  result = serviceDestination.PostDestination(destination);
        return ResponseEntity.ok(result);

    };

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> DeleteDestination(@PathVariable int id){
        serviceDestination.DeleteDestination(id);
        return ResponseEntity.noContent().build();
    };


}

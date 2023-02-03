package com.eros.transportSystem.service.Passenger;

import com.eros.transportSystem.repository.Destination;
import com.eros.transportSystem.repository.Passenger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicePassenger implements IServicePassenger{

    Passenger eros= new Passenger("eros",23);
    Passenger jose= new Passenger("jose",34);
    List<Passenger> newPassenger= new ArrayList<>();
    @Override
    public List<Passenger> getAllPassenger() {
        if (newPassenger.size() == 0){
            newPassenger.add(eros);
            newPassenger.add(jose);
        }
        return newPassenger;
    }
}

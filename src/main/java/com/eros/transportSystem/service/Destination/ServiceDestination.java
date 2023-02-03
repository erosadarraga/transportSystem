package com.eros.transportSystem.service.Destination;

import com.eros.transportSystem.repository.Bus;
import com.eros.transportSystem.repository.Destination;
import com.eros.transportSystem.repository.Passenger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceDestination implements IServiceDestination {


    Passenger eros = new Passenger("eros", 23);
    Passenger jose = new Passenger("jose", 34);
    Bus bolivariano = new Bus("Bolivariano", 400, 30, eros, "Cartagena");
    Bus expresoBrasilia = new Bus("Expreso Brasilia", 320, 25, jose, "Boyaca");
    List<String> horariosMedellin = Arrays.asList("12:30 AM", "1:00 pm", "7:20 AM");
    List<String> horariossantaMarta = Arrays.asList("2:30 PM", "6:00 PM", "9:00 AM");
    Destination medellin = new Destination("medellin", bolivariano, horariosMedellin);
    Destination santaMarta = new Destination("santa marta", expresoBrasilia, horariossantaMarta);

    List<Destination> newDestination = new ArrayList<>();
    List<Passenger> newPassenger = new ArrayList<>();

    @Override
    public List<Destination> getAllDestination() {

        if (newDestination.size() == 0) {

            newDestination.add(medellin);
            newDestination.add(santaMarta);
        }
        return newDestination;
    }

    @Override
    public Destination PostDestination(Destination destination) {
        if (newDestination.size() == 0) {
            newDestination.add(medellin);
            newDestination.add(santaMarta);
        }
        newDestination.add(destination);
        return destination;
    }

    @Override
    public void DeleteDestination(int id) {
        if (newDestination.size() == 0) {
            newDestination.add(medellin);
            newDestination.add(santaMarta);
        }
        newDestination.removeIf(destination -> destination.getId() == id);


    }


}
